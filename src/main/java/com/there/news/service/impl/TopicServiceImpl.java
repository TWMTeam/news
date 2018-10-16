package com.there.news.service.impl;

import com.there.news.entity.Topic;
import com.there.news.mapper.TopicMapper;
import com.there.news.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @BelongsProject: news
 * @BelongsPackage: com.there.news.service.impl
 * @Author: 1805783671
 * @CreateTime: 2018-10-16 13:24
 * @Description: ${Description}
 */
@Service
@Transactional(isolation= Isolation.READ_COMMITTED,propagation= Propagation.REQUIRED)
public class TopicServiceImpl implements TopicService {

    @Autowired
    TopicMapper topicMapper;

    /**
     *
     * @param name
     * @return 新增主题
     */
    @Override
    public int saveTopic(String name) {
        return topicMapper.insertTopic(name);
    }

    /**
     * @return 查询所有主题
     */
    @Override
    public List<Topic> findAllTopic() {
        return topicMapper.selectAllTopic();
    }

    /**
     * @param topic
     * @return 修改主题返回数值
     */
    @Override
    public int modifyTopic(Topic topic) {
        return topicMapper.updateTopic(topic);
    }

    /**
     *
     * @param name
     * @return 根据name查询主题
     */
    @Override
    public Topic findTopicByName(String name) {
        return topicMapper.selectTopicByName(name);
    }

    /**
     * @param tid
     * @return 根据tid删除主题,返回数值
     */
    @Override
    public int removeTopic(Integer tid) {
        return topicMapper.deleteTopic(tid);
    }
}
