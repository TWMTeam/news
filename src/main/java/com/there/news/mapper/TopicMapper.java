package com.there.news.mapper;

import com.there.news.entity.Topic;

import java.util.List;
import java.util.Map;

public interface TopicMapper {

    /**
     * @param name
     * @return 新增主题
     */
    int insertTopic(String name);

    /**
     * @return 查询所有主题
     */
    List<Topic> selectAllTopic();

    /**
     * @param topic
     * @return 修改主题返回数值
     */
    int updateTopic(Topic topic);

    /**
     *
     * @param name
     * @return 根据name查询主题
     */
    Topic selectTopicByName(String name);

    /**
     * @param tid
     * @return 根据tid删除主题,返回数值
     */
    int deleteTopic(Integer tid);
}
