package com.newer.sellhouse.service;

import com.newer.sellhouse.domain.ChangeHouseApply;
import com.newer.sellhouse.domain.ChangeHouseEdit;
import com.newer.sellhouse.domain.Payway;
import com.newer.sellhouse.mapper.ChangeHouseApplyMapper;
import com.newer.sellhouse.mapper.ChangehouseMapper;
import com.newer.sellhouse.mapper.PaywayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ChangeHouseApplyService {
    @Autowired
    private ChangeHouseApplyMapper changeHouseApplyMapper;

    @Autowired
    private PaywayMapper paywayMapper;
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int addChangeHouseApply(ChangeHouseApply changeHouseApply){
        return changeHouseApplyMapper.addChangeHouseApply(changeHouseApply);
    }

    public List<ChangeHouseApply> findAll(){
        return changeHouseApplyMapper.findAll();
    }

    public List<ChangeHouseApply> findChangeHouse(){
        return changeHouseApplyMapper.findChangeHouse();
    }

    public ChangeHouseEdit findEditByadmitbuyid(Integer admitbuyid){
        return changeHouseApplyMapper.findEditByadmitbuyid(admitbuyid);
    }

    public List<Payway> findAllPayway(){
        return paywayMapper.selectAll();
    }
}
