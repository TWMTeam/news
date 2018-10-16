package com.there.news.service;

import com.there.news.entity.Topic;

import java.util.List;

/**
 * @BelongsProject: news
 * @BelongsPackage: com.there.news.service
 * @Author: 1805783671
 * @CreateTime: 2018-10-16 13:22
 * @Description: ${Description}
 */
public interface TopicService {

    //添加新闻主题
    int saveTopic(String name);
    //获取所有主题
    List<Topic> findAllTopic();
    //更新主题
    int modifyTopic(Topic topic);
    //根据名字查找主题
    Topic findTopicByName(String name);
    //通过t_id删除主题
    int removeTopic(Integer tid);
}
