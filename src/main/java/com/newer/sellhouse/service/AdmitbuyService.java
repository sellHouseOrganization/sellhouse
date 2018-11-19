package com.newer.sellhouse.service;

import com.newer.sellhouse.domain.AdmitbuySel;
import com.newer.sellhouse.mapper.AdmibuySelMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdmitbuyService {
    @Autowired
    private AdmibuySelMapper admitbuySelMapper;

    public List<AdmitbuySel> selectAll(@Param("clientName") String clientName){
        return admitbuySelMapper.queryParam(clientName);
    }
}
