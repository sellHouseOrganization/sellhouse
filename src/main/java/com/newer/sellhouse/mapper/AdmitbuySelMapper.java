package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.Admitbuy;
import com.newer.sellhouse.domain.AdmitbuySel;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdmitbuySelMapper {

    /**
     * 认购查询  条件：查询客户姓名
     * @param clientName
     * @return
     */
    List<AdmitbuySel> queryParam(@Param("clientName") String clientName);

    int addAdmitbuy(Admitbuy admitbuy);

    int updAdmitbuy(Admitbuy admitbuy);

    @Select("select a.admitbuyid,a.admitbuyDate,a.firstPay,a.managePerson,s.fromtMoney,s.mustPrices,s.sumPrices,h.houseName,c.clientName,c.sex,c.cardnumber,c.phone," +
            "    ad.adviserName,p.payWayName from admitbuy a LEFT JOIN schedule s on a.scheduleid=s.scheduleid LEFT JOIN" +
            "    house h on a.houseid=h.houseid LEFT JOIN client c on a.clientid=c.clientid LEFT JOIN adviser ad on a.adviserid=ad.adviserid LEFT JOIN payway p" +
            "    on a.payWayid=p.payWayid where admitbuyid=#{admitbuyid}")
    AdmitbuySel queryById(Integer admitbuyid);

    @Delete("delete from admitbuy where admitbuyid=#{admitbuyid}")
    int delAdmitbuySel(Integer admitbuyid);


}
