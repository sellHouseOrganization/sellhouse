package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.Admitbuy;
import com.newer.sellhouse.domain.AdmitbuySche;
import com.newer.sellhouse.domain.AdmitbuySel;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
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

    @Insert("insert into admitbuy(firstPay,admitbuyDate,managePerson)values(#{firstPay},now(),#{managePerson})")
    int addAdmitbuy(Admitbuy admitbuy);

    @Delete("delete from admitbuy where admitbuyid=#{admitbuyid}")
    int delAdmitbuySel(Integer admitbuyid);

    List<AdmitbuySche> findAll();

    @Select("select ar.price,r.privateArea,s.fromtMoney,a.firstPay,r.privateArea*ar.price as mustPrices,mustPrices-s.fromtMoney-a.firstPay as sumPrices,c.clientName,s.scheduleDate,s.remake,p.payWayName," +
            "    h.houseName,a.admitbuyDate,a.managePerson from admitbuy a,house h,client c ,floor f,areaprice ar,schedule s,roomtype r,payway p where" +
            "    a.clientid=c.clientid AND a.scheduleid=s.scheduleid and a.houseid=h.houseid and h.houseTypeid=r.houseTypeid and h.houseid=f.floorid and a.clientid=c.clientid and f.areaPriceid=ar.areaPriceid" +
            "    and a.payWayid=p.payWayid and c.clientName = #{name}")
    AdmitbuySche findForName(@Param("name") String name);

    AdmitbuySel findByAdmitbuyid(@Param("admitbuyid")Integer admitbuyid);
}
