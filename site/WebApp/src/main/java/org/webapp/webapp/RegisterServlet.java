package org.webapp.webapp;

import BusinessLayer.UserService;
import DataAccessLayer.repositories.UserRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    private static UserService userServiceInstance = UserService.getUserServiceInstance();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("views/shared/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String deviceCode = request.getParameter("deviceCode");

        userServiceInstance.CreateUser(username, email, password, deviceCode);

        response.sendRedirect(request.getContextPath() + "/index.jsp");
    }

}

