package luckyboy.service.Impl;

import lombok.extern.slf4j.Slf4j;
import luckyboy.api.NewsDataApi;
import luckyboy.params.news.*;
import luckyboy.service.NewsDataService;
import luckyboy.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class NewsDataApiImpl implements NewsDataApi {
    @Autowired
    private NewsDataService newsDataService;

    @Override
    public Result<?> news(String start_date,String end_date,String src) {
        NewsParams build = NewsParams.builder().start_date(start_date).end_date(end_date).src(src).build();
        return newsDataService.news(build);
    }

    @Override
    public Result<?> cctv_news(String date) {
        CctvNewsParams build = CctvNewsParams.builder().date(date).build();
        return newsDataService.cctv_news(build);
    }

}