package com.newer.sellhouse.service;

import com.newer.sellhouse.domain.Payway;
import com.newer.sellhouse.mapper.PaywayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayWayService {
    @Autowired
    private PaywayMapper paywayMapper;

    public List<Payway>listAll(){
        return paywayMapper.selectAll();
    }

    public int Insert(Payway payway){
        return paywayMapper.insert(payway);
    }

    public int Update(Payway payway){
        return paywayMapper.updateByPrimaryKey(payway);
    }

    public int Delete(Integer paywayid){
        return paywayMapper.deleteByPrimaryKey(paywayid);
    }

    public Payway queryById(Integer paywayid){
        return paywayMapper.selectByPrimaryKey(paywayid);
    }

    public int changeStart(Integer paywayid,Integer notstart){
        return  paywayMapper.changeState(paywayid, notstart);
    }

}
