package BusinessLayer;

import DataAccessLayer.models.User;
import DataAccessLayer.repositories.UserRepository;

public class UserService {

    private UserRepository userRepository = new UserRepository();
    private static UserService userServiceInstance = null;
    public static UserService getUserServiceInstance(){
        if(userServiceInstance == null){
            userServiceInstance = new UserService();
        }
        return userServiceInstance;
    }

    private UserService(){

    }

    private static UserRepository userRepositoryInstance = new UserRepository();
    public void CreateUser(String username, String email, String password, String deviceCode) {
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        user.setDeviceCode(deviceCode);
        userRepositoryInstance.addAccount(user);
    }

    public boolean GetUserByUsername(String username, String password) {
        User user = new User();
        user = userRepositoryInstance.getUserByUsername(username);
        return user.getUsername().equals(username) && user.getPassword().equals(password);
    }

    public boolean CheckUserExist(String username, String email) {
        User user = new User();
        user = userRepositoryInstance.getUserByUsername(username);
        return user.getUsername().equals(username) || user.getEmail().equals(email);
    }

}
