package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import userinfo.UserInfo;

@WebServlet("/LoginServlet")
public class LoginServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// make sure we have at least the username and password post params
		if (request.getParameter("username") == null
				|| request.getParameter("password") == null) {
			loginError(request, response, "There was an error in processing your request, please try again.");
			return;
		}
		
		if (request.getParameter("username").trim().equals("")) {
			loginError(request, response, "username must not be blank");
			return;
		}
		
		if (request.getParameter("password").trim().equals("")) {
			loginError(request, response, "password must not be blank");
			return;
		}
		
		// get the session with this connection, make a new one if it doesnt
		// exist
		HttpSession session = request.getSession(true);
		
		String username = request.getParameter("username");
		char password[] = request.getParameter("password").toCharArray();

		if (validateUser(username, password)) {
			// this account exists, attempt to log them in
			UserInfo userinfo = getUserInfo(username);

			if (loginUser(userinfo)) {
				// this user was successfully logged in
				
				session.setAttribute("userinfo", userinfo);
				redirectToHome(request, response);
			} else {
				// this user must be logged in already
				
				loginError(request, response, "User: " + username + " is already logged in");
			}
		} else {
			// tell them the username or password was wrong
			
			loginError(request, response, "The username or password was wrong");
		}

		// clear the stored password from the stack
		for (int i = 0; i < password.length; i++) {
			password[i] = 0;
		}
	}

	private void loginError(HttpServletRequest request, HttpServletResponse response, String message) throws IOException, ServletException {
		request.setAttribute("loginMessage", message);
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
	}
}
