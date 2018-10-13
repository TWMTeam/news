package com.there.news.mapper;

import com.there.news.entity.Topic;

import java.util.List;
import java.util.Map;

public interface TopicMapper {

    //添加新闻主题
    int addTopic(String name);
    //获取所有主题
    List<Topic> getAllTopic();
    //更新主题
    int updateTopic(Map<String, String> topic);
    //根据名字查找主题
    Topic findTopicByName(String name);
    //通过t_id删除主题
    int deleteTopic(String tid);
}
