package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.AdmitbuySel;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdmibuySelMapper {

    List<AdmitbuySel> queryParam(@Param(value = "clientName") String clientName);
}
