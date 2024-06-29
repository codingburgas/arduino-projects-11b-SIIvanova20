package org.webapp.webapp;


import BusinessLayer.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private static UserService userServiceInstance = UserService.getUserServiceInstance();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("views/shared/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Authenticate user
        boolean isValidUser = userServiceInstance.GetUserByUsername(username, password);

        if (isValidUser) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect(request.getContextPath() + "/index.jsp");
        } else {
            // Redirect back to the login page with an error message
            request.setAttribute("errorMessage", "Invalid username or password");
            request.getRequestDispatcher("views/shared/login.jsp").forward(request, response);
        }
    }
}
