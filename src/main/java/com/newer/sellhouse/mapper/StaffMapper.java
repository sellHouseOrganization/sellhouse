package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.Staff;
import java.util.List;

public interface StaffMapper {
    int deleteByPrimaryKey(Integer staffid);

    int insert(Staff record);

    Staff selectByPrimaryKey(Integer staffid);

    List<Staff> selectAll();

    int updateByPrimaryKey(Staff record);
}