package com.newer.sellhouse.service;

import com.newer.sellhouse.domain.Admitbuy;
import com.newer.sellhouse.domain.AdmitbuySche;
import com.newer.sellhouse.domain.AdmitbuySel;
import com.newer.sellhouse.mapper.AdmitbuySelMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdmitbuySelService {
    @Autowired
    private AdmitbuySelMapper admitbuySelMapper;

    public List<AdmitbuySel> selectAll(@Param("clientName") String clientName){
        return admitbuySelMapper.queryParam(clientName);
    }

    public int delAdmitbuySel(Integer admitbuyid){
        return admitbuySelMapper.delAdmitbuySel(admitbuyid);
    }

    public  List<AdmitbuySche> findAll(){
        return admitbuySelMapper.findAll();
    }

    public AdmitbuySche findForName(Integer scheduleid){
        return admitbuySelMapper.findForName(scheduleid);
    }

    /**
     * 新增
     * @param admitbuy
     * @return
     */
    public int addAdmitbuy(Admitbuy admitbuy){
        return admitbuySelMapper.addAdmitbuy(admitbuy);
    }

    public int updAdmitbuy(String payWayName,Integer payWayid){
        return admitbuySelMapper.updAdmitbuy(payWayName, payWayid);
    }

  /*  public int updSchedule(String remake,Integer scheduleid){
        return admitbuySelMapper.updSchedule(remake, scheduleid);
    }*/
}
