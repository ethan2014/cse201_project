package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import userinfo.UserInfo;

public abstract class BaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// TODO create database credentials
	private static final String DB_URL = "temp";
	private static final String DB_USERNAME = "temp";
	private static final String DB_PASSWORD = "temp";
	
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
	
	protected final void redirectToHome(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}
	
	protected final Connection connectToDB() {
		Connection con;
		
		try {
			con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
		} catch (SQLException e) {
			con = null;
		}

		return con;
	}
	
	protected final boolean validateUser(String username, char password[]) {
		// TODO test if this combination of username and password exists
		// in the database
		return true;
	}
	
	protected final boolean userExists(String username) {
		// TODO test if this username exists in the database
		return true;
	}
	
	protected final UserInfo getUserInfo(String username) {
		// TODO get the user information (account type, logged in status, etc.) for
		// this username from the database
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
	protected final boolean loginUser(UserInfo userinfo) {
		if (userinfo.isLoggedIn()) {
			return false;
		}
		
		String username = userinfo.getUsername();
		
		// TODO test if the user by the name username is logged in.  if they are,
		// return false, if not, set there logged in flag to true in the database
		// and return true
		
		userinfo.setLoggedIn(true);
		
		return true;
	}
	
	/**
	 * attempts to log the user out.  will return true if the user is logged out
	 * successfully.  will return false if the UserInfo object is already logged out
	 * or if the database says this username is already logged out
	 * 
	 * @param userinfo
	 * @return true if logged out successfully. false otherwise.
	 */
	protected final boolean logoutUser(UserInfo userinfo) {
		if (!userinfo.isLoggedIn()) {
			return false;
		}
		
		String username = userinfo.getUsername();
		
		// TODO test if the user by the name username is logged out.  if they are,
		// return false, if not, set there logged in flag to false in the database
		// and return true
		
		userinfo.setLoggedIn(false);
		
		return true;
	}
	
	protected abstract void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	
	protected abstract void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
