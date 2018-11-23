package com.newer.sellhouse.service;

import com.newer.sellhouse.domain.ScheduleTotal;
import com.newer.sellhouse.mapper.ScheduleTotalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleTotalService {

    @Autowired
    private ScheduleTotalMapper scheduleTotalMapper ;

    /**
     * 查询所有
     * @return
     */
    public List<ScheduleTotal> listAll(){
        return scheduleTotalMapper.listAll();
    }

    /**
     * 删除
     * @param pid
     * @return
     */
    public int delSchedule (Integer pid){
        return scheduleTotalMapper.delSchedule(pid);
    }
}
