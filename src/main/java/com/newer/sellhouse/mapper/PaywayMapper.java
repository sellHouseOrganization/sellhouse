package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.Payway;
import java.util.List;

public interface PaywayMapper {
    int deleteByPrimaryKey(Integer paywayid);

    int insert(Payway record);

    Payway selectByPrimaryKey(Integer paywayid);

    List<Payway> selectAll();

    int updateByPrimaryKey(Payway record);
}