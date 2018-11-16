package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.Client;
import java.util.List;

public interface ClientMapper {
    int deleteByPrimaryKey(Integer clientid);

    int insert(Client record);

    Client selectByPrimaryKey(Integer clientid);

    List<Client> selectAll();

    int updateByPrimaryKey(Client record);
}