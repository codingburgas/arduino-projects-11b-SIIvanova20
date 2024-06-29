package DataAccessLayer.models;

public class User {
    private int Id;
    String Username;
    String Password;
    String Email;
    String DeviceCode;
    int DailyGoal;
    boolean IsActive;

    public String getDeviceCode() {
        return DeviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        DeviceCode = deviceCode;
    }

    public int getDailyGoal() {
        return DailyGoal;
    }

    public void setDailyGoal(int dailyGoal) {
        DailyGoal = dailyGoal;
    }

    public boolean isActive() {
        return IsActive;
    }

    public void setActive(boolean active) {
        IsActive = active;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

}