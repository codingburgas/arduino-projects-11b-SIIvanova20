package DataAccessLayer.repositories;

import DataAccessLayer.models.User;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

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
}
