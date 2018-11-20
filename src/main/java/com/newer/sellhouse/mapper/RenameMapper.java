package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.Renames;
import java.util.List;

public interface RenameMapper {
    int deleteByPrimaryKey(Integer renameid);

    int insert(Renames record);

    Renames selectByPrimaryKey(Integer renameid);

    List<Renames> selectAll();

    int updateByPrimaryKey(Renames record);

    List<Renames> selAll();


}