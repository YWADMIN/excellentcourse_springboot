package com.wulaobo.mapper;

import com.wulaobo.bean.Topic;

import java.util.ArrayList;

public interface TopicMapper {

    boolean addTopic(Topic topic);

    ArrayList<Topic> getAllTopic(String edituser);

    Topic getTopicById(Integer id);

    boolean editTopic(Topic topic);

    boolean deleteTopicById(Integer id);
}
