package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import userinfo.UserInfo;

@WebServlet("/LoginServlet")
public class LoginServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// make sure we have at least the username and password post params
		if (request.getParameter("username") == null
				|| request.getParameter("password") == null) {
			loginError();
		}

		String username = request.getParameter("username");
		char password[] = request.getParameter("password").toCharArray();

		// get the session with this connection, make a new one if it doesnt
		// exist
		HttpSession session = request.getSession(true);

		if (userExists(username, password)) {
			// this account exists, attempt to log them in
			UserInfo userinfo = getUserInfo(username);

			if (logInUser(userinfo)) {
				// this user was successfully logged in
			} else {
				// this user must be logged in already
			}
		} else {
			// tell them the username or password was wrong
		}

		// clear the stored password from the stack
		for (int i = 0; i < password.length; i++) {
			password[i] = 0;
		}
	}

	private void loginError() {

	}
}
