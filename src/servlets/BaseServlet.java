package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import userinfo.UserInfo;

public abstract class BaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public static final String USER_ACCOUNT = "user";
	public static final String MODERATOR_ACCOUNT = "moderator";
	public static final String ADMIN_ACCOUNT = "admin";
	
	public static final ArrayList<String> validAccountTypes = getValidAccountTypes();
	
	public static final ArrayList<String> getValidAccountTypes() {
		ArrayList<String> ret = new ArrayList<String>();
		
		ret.add(USER_ACCOUNT);
		ret.add(MODERATOR_ACCOUNT);
		ret.add(ADMIN_ACCOUNT);
		
		return ret;
	}
	
	public BaseServlet() {
		super();
	}
	
	protected final boolean userExists(String username, String password) {
		// TODO
		return true;
	}
	
	protected final UserInfo getUserInfo(String username) {
		// TODO
		UserInfo ret = new UserInfo();
		
		ret.setUsername(username);
		ret.setAccountType(USER_ACCOUNT);

		return ret;
	}
	
	/**
	 * attempts to log the user in.  will return true if the user is logged in
	 * successfully.  will return false if the UserInfo object storing this users
	 * info is already logged in or if the database says this username is already
	 * logged in
	 * 
	 * @param userinfo
	 * @return true if logged in successfully. false otherwise.
	 */
	protected final boolean logInUser(UserInfo userinfo) {
		if (userinfo.isLoggedIn()) {
			return false;
		}
		
		String username = userinfo.getUsername();
		
		return true;
	}
	
	/**
	 * attempts to log the user out.  will return true if the user is logged out
	 * successfully.  will return false if the UserInfo object is already logged out
	 * or if the database says this username is already logged out
	 * 
	 * @param userinfo
	 * @return true if logged out successfully. flase otherwise.
	 */
	protected final boolean logOutUser(UserInfo userinfo) {
		if (!userinfo.isLoggedIn()) {
			return false;
		}
		
		String username = userinfo.getUsername();
		
		return true;
	}
	
	protected abstract void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	
	protected abstract void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
