package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.ScheduleAdd;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduleAddMapper {

    /**
     * 查询所有
     * @param clientName
     * @return
     */
    List<ScheduleAdd> listAll(@Param("clientName") String clientName);

    /**
     * 根据ID查询
     * @param scheduleid
     * @return
     */
    ScheduleAdd queryById(@Param("scheduleid") Integer scheduleid);
}
