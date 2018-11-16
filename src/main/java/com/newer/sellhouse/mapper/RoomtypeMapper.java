package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.Roomtype;
import java.util.List;

public interface RoomtypeMapper {
    int deleteByPrimaryKey(Integer housetypeid);

    int insert(Roomtype record);

    Roomtype selectByPrimaryKey(Integer housetypeid);

    List<Roomtype> selectAll();

    int updateByPrimaryKey(Roomtype record);
}