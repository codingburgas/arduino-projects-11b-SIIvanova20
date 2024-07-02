package DataAccessLayer.repositories;

import DataAccessLayer.models.DailyStats;
import DataAccessLayer.models.User;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DailyStatsRepository {


    public DailyStats mapToDailyStats(ResultSet set){
        DailyStats dailyStats = new DailyStats();

        try{
            while(set.next()) {
                dailyStats.setId(set.getInt("Id"));
                dailyStats.setDate(set.getString("Date"));
                dailyStats.setSteps(set.getInt("Steps"));
                dailyStats.setBurnedCalories(set.getDouble("BurnedCalories"));
                dailyStats.setDistance(set.getInt("Distance"));
                dailyStats.setUserId(set.getInt("UserId"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return dailyStats;
    }

    public DailyStats getDailyStatsByUserIdAndDate(int UserId, String Date){


        String query = String.format("SELECT * FROM DailyStats WHERE UserId = '%s' AND [Date] = '%s'", UserId, Date);

        Connection connectionInstance;
        Statement statement;
        ResultSet set;

        try {
            connectionInstance = DBConnection.getInstance();
            statement = connectionInstance.createStatement();
            set = statement.executeQuery(query);

        } catch (SQLException e){
            throw new RuntimeException(e);
        }

        DailyStats dailyStats = new DailyStats();
        dailyStats = mapToDailyStats(set);
        return dailyStats;
    }
}
