package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.ChangeHouseApply;
import org.apache.ibatis.annotations.Insert;

public interface ChangeHouseApplyMapper {

    @Insert("insert into changehouseapply(admitBuyid,changeType,causeClassifiCation,reasonsForChange,checkSuccessNo)" +
            " values(#{admitBuyid},#{changeType},#{causeClassifiCation},#{reasonsForChange},0)")
    int addChangeHouseApply(ChangeHouseApply changeHouseApply);
}
