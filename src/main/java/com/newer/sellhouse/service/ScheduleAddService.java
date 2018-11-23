package com.newer.sellhouse.service;

import com.newer.sellhouse.domain.ScheduleAdd;
import com.newer.sellhouse.mapper.ScheduleAddMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleAddService {

    @Autowired
    private ScheduleAddMapper scheduleAddMapper ;

    /**
     * 查询所有
     * @param clientName
     * @return
     */
    public List<ScheduleAdd> listAll(String clientName){
        return scheduleAddMapper.listAll(clientName);
    }

    /**
     * 根据ID查询
     * @param scheduleid
     * @return
     */
    public ScheduleAdd queryById(Integer scheduleid){
        return scheduleAddMapper.queryById(scheduleid);
    }
}
