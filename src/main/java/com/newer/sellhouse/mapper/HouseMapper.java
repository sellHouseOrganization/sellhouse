package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.House;
import java.util.List;

public interface HouseMapper {
    int deleteByPrimaryKey(Integer houseid);

    int insert(House record);

    House selectByPrimaryKey(Integer houseid);

    List<House> selectAll();

    int updateByPrimaryKey(House record);
}