package com.newer.sellhouse.mapper;

import com.newer.sellhouse.domain.Client;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ClientMapper {

    int deleteByPrimaryKey(Integer clientid);

    @Insert("insert into client(clientName,sex,cardnumber,age,phone) values(#{clientName},#{sex},#{cardnumber},#{age},#{phone})")
    int insert(Client client);

    Client selectByPrimaryKey(Integer clientid);

    List<Client> selectAll();

    int updateByPrimaryKey(Client client);

}