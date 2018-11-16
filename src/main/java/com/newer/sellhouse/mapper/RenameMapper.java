package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.Rename;
import java.util.List;

public interface RenameMapper {
    int deleteByPrimaryKey(Integer renameid);

    int insert(Rename record);

    Rename selectByPrimaryKey(Integer renameid);

    List<Rename> selectAll();

    int updateByPrimaryKey(Rename record);
}