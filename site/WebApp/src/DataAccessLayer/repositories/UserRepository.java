package DataAccessLayer.repositories;

import DataAccessLayer.models.User;
import utils.DBConnection;

import java.sql.*;

public class UserRepository {
    public void addAccount(User user){
        String query = String.format(
                "INSERT INTO Users (Username, Email, Password, DeviceCode) VALUES ('%s','%s','%s', '%s')",
                user.getUsername(),
                user.getEmail(),
                user.getPassword(),
                user.getDeviceCode());


        Connection connectionInstance;
        Statement statement;

        try {
            connectionInstance = DBConnection.getInstance();
            statement = connectionInstance.createStatement();
            statement.executeUpdate(query);

        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public User mapToUser(ResultSet set){
        User user = new User();

        try{
            while(set.next()) {
                user.setId(set.getInt("Id"));
                user.setUsername(set.getString("Username"));
                user.setEmail(set.getString("Email"));
                user.setPassword(set.getString("Password"));
                user.setDeviceCode(set.getString("DeviceCode"));
                user.setDailyGoal(set.getInt("DailyGoal"));
                user.setIsActive(set.getBoolean("IsActive"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    public User getUserByUsername(String username){


        String query = String.format("SELECT * FROM Users WHERE username = '%s'", username);

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

        User user = new User();
        user = mapToUser(set);
        return user;
    }

}
