package com.newer.sellhouse.service;

import com.newer.sellhouse.domain.Admitbuy;
import com.newer.sellhouse.mapper.AdmitbuyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OffersumService {
    @Autowired
    private AdmitbuyMapper admitbuyMapper;

    public List<Admitbuy> selectAdmitBuyByClientNameHouseName(String clientName,String houseName){
        return admitbuyMapper.selectAdmitBuyByClientNameHouseName(clientName,houseName);
    }
}
