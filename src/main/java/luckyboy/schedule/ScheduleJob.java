package luckyboy.schedule;

import luckyboy.service.BasicDataService;
import luckyboy.service.MarketDataService;
import luckyboy.util.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleJob {
    @Autowired
    private BasicDataService basicDataService;

    @Autowired
    private MarketDataService marketDataService;

    @Scheduled(cron = "0 0 9 ? * 1-5")
    public void StockBasic(){
        basicDataService.StockBasic();
    }

    @Scheduled(cron = "0 0 9 1 1 ?")
    public void TradeCal(){
        String s = DataFormat.DTFormat(System.currentTimeMillis());
        basicDataService.TradeCal(s,null);
    }

    @Scheduled(cron = "30 0 9 ? * 1-5")
    public void NameChange(){
        String s = DataFormat.DTFormat(System.currentTimeMillis());
        basicDataService.NameChange(null,s,null);
    }

    @Scheduled(cron = "0 0 15 ? * 1")
    public void HsConst(){
        basicDataService.HsConst("SH");
        basicDataService.HsConst("SZ");
    }

    @Scheduled(cron = "0 0 9 ? * 7")
    public void StockCompany(){
        basicDataService.StockCompany("SSE");
        basicDataService.StockCompany("SZSE");
    }

//    @Scheduled(cron = "0 0 8 * * ?")
//    public void StkRewards(){
//        String s = DataFormat.DTFormat(System.currentTimeMillis());
//        basicDataService.StkRewards(null,s);
//    }

    @Scheduled(cron = "0 30 8 * * ?")
    public void NewShare(){
        String s = DataFormat.DTFormat(System.currentTimeMillis());
        basicDataService.NewShare(s,s);
    }

    @Scheduled(cron = "0 0 19 ? * 1-5")
    public void daily(){
        String s = DataFormat.DTFormat(System.currentTimeMillis());
        marketDataService.daily(null,s,null,null);
    }

    @Scheduled(cron = "30 0 19 ? * 6")
    public void weekly(){
        String s = DataFormat.DTFormat(System.currentTimeMillis()-86400000);
        marketDataService.weekly(null,s,null,null);
    }

    @Scheduled(cron = "0 1 19 1 * ?")
    public void monthly(){
        String s = DataFormat.DTFormat(System.currentTimeMillis()-86400000);
        marketDataService.monthly(null,s,null,null);
    }

    @Scheduled(cron = "0 2 19 ? * 1-5")
    public void adjFactor(){
        String s = DataFormat.DTFormat(System.currentTimeMillis());
        marketDataService.adjFactor(null,s,null,null);
    }

    @Scheduled(cron = "0 3 19 ? * 1-5")
    public void suspendD(){
        String s = DataFormat.DTFormat(System.currentTimeMillis());
        marketDataService.suspendD(null,s,null,null);
    }

    @Scheduled(cron = "0 4 19 ? * 1-5")
    public void daily_basic(){
        String s = DataFormat.DTFormat(System.currentTimeMillis());
        marketDataService.daily_basic(null,s,null,null);
    }

    @Scheduled(cron = "0 4 19 ? * 1-5")
    public void moneyflow(){
        String s = DataFormat.DTFormat(System.currentTimeMillis());
        marketDataService.moneyflow(null,s,null,null);
    }

    @Scheduled(cron = "0 20 9 ? * 1-5")
    public void stkLimit(){
        String s = DataFormat.DTFormat(System.currentTimeMillis());
        marketDataService.stkLimit(null,s,null,null);
    }

    @Scheduled(cron = "30 4 22 ? * 1-5")
    public void moneyflowHsgt(){
        String s = DataFormat.DTFormat(System.currentTimeMillis());
        marketDataService.moneyflowHsgt(s,null,null);
    }

    @Scheduled(cron = "0 5 22 ? * 1-5")
    public void hsgtTop10(){
        String s = DataFormat.DTFormat(System.currentTimeMillis());
        marketDataService.hsgtTop10(null,s,null,null);
    }

    @Scheduled(cron = "0 6 22 ? * 1-5")
    public void ggtTop10(){
        String s = DataFormat.DTFormat(System.currentTimeMillis());
        marketDataService.hsgtTop10(null,s,null,null);
    }

    @Scheduled(cron = "0 7 22 ? * 1-5")
    public void ggtDaily(){
        String s = DataFormat.DTFormat(System.currentTimeMillis());
        marketDataService.ggtDaily(s,null,null);
    }

    @Scheduled(cron = "0 5 9 1 * ?")
    public void ggtMonthly(){
        String s = DataFormat.DTFormat(System.currentTimeMillis()-86400000);
        marketDataService.ggtMonthly(s,null,null);
    }
}
