package Controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BaseClasses.BaseController;
import Beans.UserBean;
import Constants.AppConstants;
import DAOs.UserDAO;

public class AccountController extends BaseController {
	/**
	 * GET: アカウント登録ページへ飛ぶ POST:　アカウント登録処理を実行
	 */
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try {
			// 処理の切り替え
			if (request.getMethod().equals("GET")) {
				// アカウント情報登録ページへ飛ぶ
				request.getServletContext()
						.getRequestDispatcher(
								AppConstants.FOWARD_PATH.CONST_ACCOUNT_ADD_JSP)
						.forward(request, response);
			} else if (request.getMethod().equals("POST")) {
				UserDAO dbObj = new UserDAO();
				int registerNum = dbObj.addUser(request);
				if (registerNum == 1) {
					request.getServletContext()
							.getRequestDispatcher(
									AppConstants.FOWARD_PATH.CONST_ACCOUNT_COMPLETE_JSP)
							.forward(request, response);
				} else {
					goError(request, response);
				}
			}
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}

	// アカウント情報の変更ページへ飛ぶ
	public void editAction(HttpServletRequest request,
			HttpServletResponse response) {
		// アクションの権限をセット
		try {
			if (request.getMethod().equals("GET")) {
				request.getServletContext()
						.getRequestDispatcher(
								AppConstants.FOWARD_PATH.CONST_ACCOUNT_EDIT_JSP)
						.forward(request, response);
			} else if (request.getMethod().equals("POST")) {
				UserDAO dbObj = new UserDAO();
				int registerNum = dbObj.updateAccountName(request);
				if (registerNum == 1) {
					request.getServletContext()
							.getRequestDispatcher(
									AppConstants.FOWARD_PATH.CONST_ACCOUNT_COMPLETE_JSP)
							.forward(request, response);
				} else {
					goError(request, response);
				}
			}
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}
}