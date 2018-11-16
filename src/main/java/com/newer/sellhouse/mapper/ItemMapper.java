package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.Item;
import java.util.List;

public interface ItemMapper {
    int deleteByPrimaryKey(Integer itemid);

    int insert(Item record);

    Item selectByPrimaryKey(Integer itemid);

    List<Item> selectAll();

    int updateByPrimaryKey(Item record);
}