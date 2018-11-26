package com.newer.sellhouse.service;

import com.newer.sellhouse.domain.Admitbuy;
import com.newer.sellhouse.domain.House;
import com.newer.sellhouse.domain.Refund;
import com.newer.sellhouse.mapper.AdmitbuyMapper;
import com.newer.sellhouse.mapper.ClientMapper;
import com.newer.sellhouse.mapper.HouseMapper;
import com.newer.sellhouse.mapper.RefundMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RefundService {
    @Autowired
    private RefundMapper refundMapper;
    @Autowired
    private AdmitbuyMapper admitbuyMapper;
    @Autowired
    private HouseMapper houseMapper;

    public List<Refund> selAll(){

        return refundMapper.selAll();
    }

    /**
     * 退房操作中进行了  改变房源状态为0--可销售状态 和删除 认购的数据
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int insRefund(Refund  refund, Admitbuy admitbuy){
            House house=houseMapper.selectByPrimaryKey(admitbuy.getHouseid());
            house.setHousestateid(0);
            //修改房源状态
            int frw=houseMapper.changeState(house.getHouseid(),house.getHousestateid());
            //删除认购
       // int ret= admitbuyMapper.deleteByPrimaryKey(admitbuy.getAdmitbuyid());
           if(frw>0){
               return refundMapper.insert(refund);
           }
        return 0;
    }
}
