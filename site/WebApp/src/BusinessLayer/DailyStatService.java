package BusinessLayer;

import DataAccessLayer.repositories.DailyStatsRepository;
import DataAccessLayer.repositories.UserRepository;

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
}
