package BusinessLayer;

import DataAccessLayer.models.DailyStats;
import DataAccessLayer.repositories.DailyStatsRepository;
import DataAccessLayer.repositories.UserRepository;

import java.sql.Date;

public class DailyStatService {
    private DailyStatsRepository dailyStatsRepository = new DailyStatsRepository();
    private static DailyStatService dailyStatService = null;
    public static DailyStatService getDailyStatServiceInstance(){
        if(dailyStatService == null){
            dailyStatService = new DailyStatService();
        }
        return dailyStatService;
    }

    private DailyStatService(){

    }

    public DailyStats getDailyStats(int UserId, Date date){
        DailyStats dailyStats = DailyStatsRepository.getDailyStatsByUserIdAndDate(UserId, date);
        return dailyStats;
    }
}
