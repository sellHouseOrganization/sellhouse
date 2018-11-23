package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.ScheduleTotal;
import org.apache.ibatis.annotations.Delete;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ScheduleTotalMapper {
    List<ScheduleTotal> listAll();

    @Delete("delete from schedule where scheduleid = #{scheduleid}")
    int delSchedule(Integer pid);
}
