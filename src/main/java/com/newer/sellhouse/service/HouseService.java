package com.newer.sellhouse.service;

import com.newer.sellhouse.domain.Floor;
import com.newer.sellhouse.domain.House;
import com.newer.sellhouse.mapper.HouseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseService {
    @Autowired
    private HouseMapper houseMapper;

    public List<House>listAll(){
       return houseMapper.selectAll();
    }

    public int Insert(House house){
        return houseMapper.insert(house);
    }

    public int Delete(Integer Houseid){
        return houseMapper.deleteByPrimaryKey(Houseid);
    }

    public int Update(House house){
        return houseMapper.updateByPrimaryKey(house);
    }

    public House queryById(Integer Houseid){
        return houseMapper.selectByPrimaryKey(Houseid);
    }
}
