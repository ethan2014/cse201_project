package userinfo;

import servlets.BaseServlet;

public class UserInfo {
	private boolean loggedIn;
	
	private String username;
	private String accountType;
	
	/*
	 * getters
	 */
	public boolean isLoggedIn() {
		return loggedIn;
	}
	
	public String getUsername() {
		return new String(username);
	}
	
	public String getAccountType() {
		return new String(accountType);
	}
	
	/*
	 * setters
	 */
	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
	
	public void setUsername(String username) {
		this.username = new String(username);
	}
	
	public void setAccountType(String accountType) {
		if (BaseServlet.validAccountTypes.contains(accountType)) {
			this.accountType = accountType;
		} else {
			this.accountType = BaseServlet.USER_ACCOUNT;
		}
	}
}
