package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.Admitbuy;
import com.newer.sellhouse.domain.AdmitbuySel;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdmitbuySelMapper {
    //admitBuyid,manageperson,firstpay,admitbuydate,clientName,sex,cardnumber, phone,fromtmoney,adviserName,mustprices,sumprices,houseName,payWayName
   // @Select("select * from admitbuy a,schedule s,house h ,client c,adviser ad,payway p WHERE a.scheduleid=s.scheduleid and a.houseid=h.houseid and a.clientid=c.clientid and a.adviserid=ad.adviserid and a.payWayid=p.payWayid")
    List<AdmitbuySel> queryParam(@Param("clientName") String clientName);
}
