package com.there.news.mapper;

import com.there.news.entity.News;

import java.util.List;

public interface NewsMapper {

    // 获取所有新闻
    List<News> getAllnews();

    // 获取某主题下的所有新闻
    List<News> getAllnewsByTID(int N_T_id);

    // 获取某主题下的所有新闻
    List<News> getAllnewsByTName(String T_name);

    // 获取某条新闻
    News getNewsByNID(int N_id);

    // 删除某条新闻
    int deleteNews(String N_id);

    // 统计N_id的数目
    int countNews(String N_T_id);

    // 通过分页获取所有新闻
    List<News> getAllnewsByPage(int Tid, int start, int end);

    // 对首页新闻进行分页
    List<News> getAllnews(int beginIndex, int pageCount);

    List<News> getAllNewsPage(int pageNow);

    // 添加新闻
    int addNews(News news);

    // 更新新闻
    int updateNews(News news);
}
