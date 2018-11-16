package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.Promptnotesregister;
import java.util.List;

public interface PromptnotesregisterMapper {
    int deleteByPrimaryKey(Integer promptnotesregisterid);

    int insert(Promptnotesregister record);

    Promptnotesregister selectByPrimaryKey(Integer promptnotesregisterid);

    List<Promptnotesregister> selectAll();

    int updateByPrimaryKey(Promptnotesregister record);
}