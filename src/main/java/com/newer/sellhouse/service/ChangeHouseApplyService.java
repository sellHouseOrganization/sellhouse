package com.newer.sellhouse.service;

import com.newer.sellhouse.domain.ChangeHouseApply;
import com.newer.sellhouse.mapper.ChangeHouseApplyMapper;
import com.newer.sellhouse.mapper.ChangehouseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChangeHouseApplyService {
    @Autowired
    private ChangeHouseApplyMapper changeHouseApplyMapper;

    public int addChangeHouseApply(ChangeHouseApply changeHouseApply){
        return changeHouseApplyMapper.addChangeHouseApply(changeHouseApply);
    }
}
