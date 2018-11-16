package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.Refund;
import java.util.List;

public interface RefundMapper {
    int deleteByPrimaryKey(Integer refundid);

    int insert(Refund record);

    Refund selectByPrimaryKey(Integer refundid);

    List<Refund> selectAll();

    int updateByPrimaryKey(Refund record);
}