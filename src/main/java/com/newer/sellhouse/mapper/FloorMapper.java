package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.Floor;
import java.util.List;

public interface FloorMapper {
    int deleteByPrimaryKey(Integer floorid);

    int insert(Floor record);

    Floor selectByPrimaryKey(Integer floorid);

    List<Floor> selectAll();

    int updateByPrimaryKey(Floor record);
}