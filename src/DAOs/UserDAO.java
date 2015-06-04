package DAOs;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import BaseClasses.BaseDAO;
import Beans.UserBean;
import Constants.AppConstants;
import Utils.Encrypt;
import Utils.Util;

public class UserDAO extends BaseDAO {
	public UserDAO() {
		startConnection();
	}

	@SuppressWarnings("finally")
	public UserBean selectUser(HttpServletRequest request) {
		// 該当するユーザー
		UserBean user = new UserBean();
		ResultSet rs = null;
		try {
			// sql文の作成
			String sql = "SELECT * FROM user_table"
					+ " Where account_name = ? AND" + " password = ?;";
			PreparedStatement prstmt = conn.prepareStatement(sql);
			int incrementalSymbol = 1;
			prstmt.setString(incrementalSymbol++,
					request.getParameter("account_name"));
			prstmt.setString(incrementalSymbol++,
					request.getParameter("PASSWORD"));
			rs = prstmt.executeQuery();
			// 結果の取得
			if (rs.next()) {
				user.setUserName(rs.getString("account_name"));
				user.setPassword(rs.getString("password"));
				user.setMail(rs.getString("mail"));
				user.setCreatedAt(rs.getString("created_at"));
				user.setUpdatedAt(rs.getString("updated_at"));
				user.setUserId(rs.getInt("user_id"));
				user.setAuthFlag(AppConstants.AUTH_FLAG.AUTH_SIGNEDIN_USER);
			}
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		} finally {
			finishConnection();
			return user;
		}
	}

	/**
	 * 全てのユーザを取得
	 * 
	 * @return
	 */
	public List<UserBean> selectALLUserList() {
		// ユーザーリスト
		List<UserBean> userList = new ArrayList<>();
		try {
			// クエリ文作成
			String sql = "SELECT * FROM user_table";
			PreparedStatement prstmt = conn.prepareStatement(sql);
			// 検索実行
			ResultSet rs = null;
			prstmt = conn.prepareStatement(sql);
			rs = prstmt.executeQuery();
			// テーブルからの結果を取得
			while (rs.next()) {
				UserBean user = new UserBean();
				user.setUserId(rs.getInt("user_id"));
				user.setUserName(rs.getString("account_name"));
				userList.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// データベース切断処理
			finishConnection();
		}
		return userList;
	}

	public int addUser(HttpServletRequest request) {
		// 成功件数
		int successNum = 0;
		try {
			// フォームから送られてきた値の取得
			String userName = request.getParameter("ACCOUNT_NAME");
			String mail = request.getParameter("MAIL");
			String password = request.getParameter("PASSWORD");
			String checkPassword = request.getParameter("CHECK_PASSWORD");
			Util.l("ok1>>>>>" + userName + mail + password + checkPassword);
			Util.l("チェック結果>>>>>" + checkUserName(userName) + checkEmail(mail)
					+ checkUserPassword(password));
			// 値の確認
			if (checkUserName(userName) && checkEmail(mail)
					&& checkUserPassword(password)) {
				// パスワードの確認
				if (password.equals(checkPassword)) {
//					// 暗号化

					String encryptedPassword = Encrypt.SHA512(password);
					Util.l(encryptedPassword);
					// sql文の作成
					String sql = "INSERT INTO user_table (mail, account_name, password)"
							+ " values(?,?,?);";
					PreparedStatement prstmt = conn.prepareStatement(sql);
					// 値のセット
					prstmt.setString(1, mail);
					prstmt.setString(2, userName);
					prstmt.setString(3, encryptedPassword);
					// SQL実行
					successNum = prstmt.executeUpdate();
					Util.l("成功件数" + successNum);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return successNum;
	}

	private boolean checkUserName(String userName) {
		if (userName == null) {
			return false;
		}
		Util.l("一つ目name");
		if (userName.length() <= 4 || userName.length() >= 16) {
			return false;
		}
		Util.l("2つ目name");
		if (!userName.matches("^[0-9a-zA-Z]*$")) {
			return false;
		}
		Util.l("3つ目name");
		return true;
	}

	private boolean checkUserPassword(String password) {
		if (password == null) {
			return false;
		}
		Util.l("一つ目pass");
		if (password.length() <= 7 || password.length() >= 16) {
			return false;
		}
		Util.l("2つ目pass");
		if (!password.matches("^[0-9a-zA-Z]*$")) {
			return false;
		}
		Util.l("3つ目pass");
		return true;
	}

	private boolean checkEmail(String mail) {
		if (mail == null) {
			return false;
		}
		Util.l("一つ目em");
		if (!mail.matches("[^@].*@{1}.*")) {
			return false;
		}
		Util.l("2つ目em");
		return true;
	}
}
