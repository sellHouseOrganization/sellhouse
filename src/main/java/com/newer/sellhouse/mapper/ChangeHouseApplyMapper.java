package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.ChangeHouseApply;
import com.newer.sellhouse.domain.ChangeHouseEdit;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ChangeHouseApplyMapper {

    @Insert("insert into changehouseapply(admitBuyid,changeType,causeClassifiCation,reasonsForChange,checkSuccessNo,scrapNo)" +
            " values(#{admitBuyid},#{changeType},#{causeClassifiCation},#{reasonsForChange},0,0)")
    int addChangeHouseApply(ChangeHouseApply changeHouseApply);

    List<ChangeHouseApply> findAll();

    List<ChangeHouseApply> findChangeHouse();

    ChangeHouseEdit findEditByadmitbuyid(@Param("admitbuyid")Integer admitbuyid);
}
