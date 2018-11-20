package com.newer.sellhouse.service;

import com.newer.sellhouse.domain.Admitbuy;
import com.newer.sellhouse.domain.Offersum;
import com.newer.sellhouse.mapper.AdmitbuyMapper;
import com.newer.sellhouse.mapper.OffersumMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OffersumService {
    @Autowired
    private AdmitbuyMapper admitbuyMapper;

    @Autowired
    private OffersumMapper offersumMapper;
    public List<Admitbuy> selectAdmitBuyByClientNameHouseName(String clientName,String houseName){
        return admitbuyMapper.selectAdmitBuyByClientNameHouseName(clientName,houseName);
    }
    public List<Offersum> findbyadmitbuyid(Integer admitbuyid){
        return offersumMapper.findbyadmitbuyid(admitbuyid);
    }
}
