package Constants;

import java.util.HashMap;

public class AppConstants {
	//データベース
	public static class DATABASE{
		public static final String DB_URL = "jdbc:mysql://localhost/dokopro_db";
		public static final String DB_USER = "dokopro";
		public static final String DB_PASS = "dokopro";
	}

	//フォワードパス
	public static class FOWARD_PATH{
		public static final String CONST_INDEX_JSP = "/WEB-INF/jsp/index.jsp";
		public static final String CONST_LOGIN_JSP = "/WEB-INF/jsp/login.jsp";
		public static final String CONST_LOGOUT_JSP = "/WEB-INF/jsp/logout.jsp";
		public static final String CONST_ERROR_JSP =  "/WEB-INF/jsp/error.jsp";
		public static final String CONST_COURSE_DETAIL_JSP = "/WEB-INF/jsp/courseDetail.jsp";
		public static final String CONST_COURSE_INDEX_JSP = "/WEB-INF/jsp/courseList.jsp";
		public static final String CONST_COURSE_CONTENT_JSP= "/WEB-INF/jsp/courseContent.jsp";
		public static final String CONST_ACCOUNT_EDIT_JSP = "/WEB-INF/jsp/accountSetting.jsp";
		public static final String CONST_ACCOUNT_ADD_JSP = "/WEB-INF/jsp/accountAdd.jsp";
		public static final String CONST_ACCOUNT_COMPLETE_JSP = "/WEB-INF/jsp/accountComplete.jsp";
		public static final String CONST_MYPAGE_JSP = "/WEB-INF/jsp/mypage.jsp";
		public static final String CONST_MYPAGE_EDIT_JSP = "/WEB-INF/jsp/mypageEdit.jsp";
		public static final String CONST_GROUP_LIST_JSP = "/WEB-INF/jsp/groupList.jsp";
		public static final String CONST_GROUP_EDIT_JSP = "/WEB-INF/jsp/groupEdit.jsp";
		public static final String CONST_GROUP_ADD_JSP = "/WEB-INF/jsp/groupAdd.jsp";
		public static final String CONST_GROUP_DETAIL_JSP = "/WEB-INF/jsp/groupDetail.jsp";
		public static final String CONST_ADMIN_INDEX_JSP =  "/WEB-INF/jsp/adminSelect.jsp";
		public static final String CONST_ADMIN_ADD_CONTENT_JSP =  "/WEB-INF/jsp/selectContentAdd.jsp";
		public static final String CONST_ADMIN_ADD_CONTENTS_JSP = "/WEB-INF/jsp/contentsAdd.jsp";
		public static final String CONST_ADMIN_ADD_CATEGORY_JSP = "/WEB-INF/jsp/categoryAdd.jsp";
		public static final String CONST_ADMIN_ADD_SUB_CATEGORY_JSP = "/WEB-INF/jsp/subCategoryAdd.jsp";
		public static final String CONST_ADMIN_ADD_ITEM_JSP = "/WEB-INF/jsp/itemAdd.jsp";
		public static final String CONST_PROJECT_ADD_JSP = "/WEB-INF/jsp/projectAdd.jsp";
		public static final String CONST_PROJECT_DETAIL_JSP = "/WEB-INF/jsp/projectDetail.jsp";
		public static final String CONST_PROJECT_LIST_JSP = "/WEB-INF/jsp/projectList.jsp";
		public static final String CONST_TASK_LIST_JSP = "/WEB-INF/jsp/taskList.jsp";

	}

	public static class REQUEST_ATTIRIBUTE{
		public static final String CONTENTS_LIST = "CONTENTS_LIST";
		public static final String CATEGORY_LIST = "CATEGORY_LIST";
		public static final String CATEGORYY = "CATEOGY";
		public static final String PATH = "PATH";
		public static final String SUB_CATEGORY_LIST = "SUB_CATEGORY_LIST";
		public static final String SUB_CATEGORY = "SUB_CATEGORY";
		public static final String ITEM ="ITEM";
		public static final String NESTED_PROJECT = "NESTED_PROJECT_LIST";
		public static final String GROUP_LIST = "GROUP_LIST";
		public static final String PROJECT_LIST = "PROJECT_LIST";
		public static final String GROUP = "GROUP";
		public static final String USER_INF = "USER_INF";
		public static final String CATEGORY_ID = "CLICKED_CATEGORY_ID";
		public static final String CONTENTS_ID = "CONTENTS_ID";
	}

	//コントローラクラス権限
	public static class AUTH_FLAG{
		public static final int AUTH_ALL_USER = 1;
		public static final int AUTH_SIGNEDIN_USER = 2;
		public static final int AUTH_GROUP_LEADER = 3;
		public static final int AUTH_SYSTEM_ADMIN = 4;
	}

	//エラーメッセージ
	public static class ERROR_MESSAGE{
		public static final String CONST_PATH_ERROR = "そのURLは存在しません。";
	}

	public static class AUTH_MAP{
		public static final HashMap<String, Integer> authMap = new HashMap<String,Integer>(){
			{
				put("account/execute", AUTH_FLAG.AUTH_ALL_USER);
				put("account/edit", AUTH_FLAG.AUTH_SIGNEDIN_USER);
				put("admin/addcontent",AUTH_FLAG.AUTH_SYSTEM_ADMIN);
				put("admin/execute", AUTH_FLAG.AUTH_SYSTEM_ADMIN);
				put("course/execute", AUTH_FLAG.AUTH_SIGNEDIN_USER);
				put("course/detail", AUTH_FLAG.AUTH_SIGNEDIN_USER);
				put("course/content", AUTH_FLAG.AUTH_SIGNEDIN_USER);
				put("course/item", AUTH_FLAG.AUTH_SIGNEDIN_USER);
				put("error/execute", AUTH_FLAG.AUTH_ALL_USER);
				put("mypage/execute", AUTH_FLAG.AUTH_SIGNEDIN_USER);
				put("mypage/edit", AUTH_FLAG.AUTH_SIGNEDIN_USER);
				put("group/execute", AUTH_FLAG.AUTH_SIGNEDIN_USER);
				put("group/add", AUTH_FLAG.AUTH_SIGNEDIN_USER);
				put("group/edit", AUTH_FLAG.AUTH_GROUP_LEADER);
				put("group/detail", AUTH_FLAG.AUTH_SIGNEDIN_USER);
				put("group/addgroupmember", AUTH_FLAG.AUTH_SIGNEDIN_USER);
				put("logout/execute", AUTH_FLAG.AUTH_SIGNEDIN_USER);
				put("login/execute", AUTH_FLAG.AUTH_ALL_USER);
				put("login/main", AUTH_FLAG.AUTH_ALL_USER);
				put("index/execute", AUTH_FLAG.AUTH_ALL_USER);
				put("admin/addcontents", AUTH_FLAG.AUTH_SYSTEM_ADMIN);
				put("admin/addcategory", AUTH_FLAG.AUTH_SYSTEM_ADMIN);
				put("admin/addsubcategory", AUTH_FLAG.AUTH_SYSTEM_ADMIN);
				put("admin/additem", AUTH_FLAG.AUTH_SYSTEM_ADMIN);
				put("group/join", AUTH_FLAG.AUTH_SIGNEDIN_USER);
				put("progress/getsubcategoryprogress", AUTH_FLAG.AUTH_SIGNEDIN_USER);
				put("progress/getcompleteitemidlist", AUTH_FLAG.AUTH_SIGNEDIN_USER);
				put("project/add",AUTH_FLAG.AUTH_SIGNEDIN_USER);
				put("project/detail", AUTH_FLAG.AUTH_SIGNEDIN_USER);
				put("project/task", AUTH_FLAG.AUTH_SIGNEDIN_USER);
			}
		};
	}
	
	public static String FROM_ADDRRESS = "test@mail.localhost";
	public static String HOST = "localhost";
}
