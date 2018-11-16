package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.Schedule;
import java.util.List;

public interface ScheduleMapper {
    int deleteByPrimaryKey(Integer scheduleid);

    int insert(Schedule record);

    Schedule selectByPrimaryKey(Integer scheduleid);

    List<Schedule> selectAll();

    int updateByPrimaryKey(Schedule record);
}