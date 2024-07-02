package org.webapp.webapp;

import BusinessLayer.DailyStatService;
import BusinessLayer.UserService;
import DataAccessLayer.models.DailyStats;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@WebServlet("/statistics")
public class StatisticsServerlet extends HttpServlet {

    private static UserService userServiceInstance = UserService.getUserServiceInstance();
    private static DailyStatService dailyStatServiceInstance = DailyStatService.getDailyStatServiceInstance();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        request.setAttribute("steps", session.getAttribute("steps"));
        request.setAttribute("burnedCalories", session.getAttribute("burnedCalories"));
        request.setAttribute("distance", session.getAttribute("distance"));
        request.getRequestDispatcher("index.jsp").forward(request, response);
        ;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = request.getParameter("date");;
        java.util.Date date = null;
        try {
            date =  dateFormat.parse(dateString);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());

        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        int userId = userServiceInstance.GetUserIdByUsername(username);
        DailyStats dailyStats = dailyStatServiceInstance.getDailyStats(userId, sqlDate);
        session.setAttribute("steps", dailyStats.getSteps());
        session.setAttribute("burnedCalories", dailyStats.getBurnedCalories());
        session.setAttribute("distance", dailyStats.getDistance());
        session.setAttribute("date", dailyStats.getDate());
        doGet(request, response);
    }
}
