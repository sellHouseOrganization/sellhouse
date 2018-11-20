package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.Offersum;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OffersumMapper {
    int deleteByPrimaryKey(Integer offersumid);

    int insert(Offersum record);

    Offersum selectByPrimaryKey(Integer offersumid);

    List<Offersum> selectAll();

    int updateByPrimaryKey(Offersum record);

    List<Offersum> findbyadmitbuyid(@Param("admitbuyid")Integer admitbuyid);
}