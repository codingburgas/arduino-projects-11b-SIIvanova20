package DataAccessLayer.models;

import java.sql.Date;

public class DailyStats {
    private int Id;
    private Date Date;
    private int Steps;
    private double BurnedCalories;
    private int Distance;
    private int UserId;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date date) {
        Date = date;
    }

    public int getSteps() {
        return Steps;
    }

    public void setSteps(int steps) {
        Steps = steps;
    }

    public double getBurnedCalories() {
        return BurnedCalories;
    }

    public void setBurnedCalories(double burnedCalories) {
        BurnedCalories = burnedCalories;
    }

    public int getDistance() {
        return Distance;
    }

    public void setDistance(int distance) {
        Distance = distance;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }


}
