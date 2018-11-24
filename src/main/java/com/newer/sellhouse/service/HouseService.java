package com.newer.sellhouse.service;

import com.newer.sellhouse.domain.Floor;
import com.newer.sellhouse.domain.House;
import com.newer.sellhouse.mapper.HouseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HouseService {
    @Autowired
    private HouseMapper houseMapper;

    public List<House>listAll(Integer pageno,Integer pagesum){
       return houseMapper.selectAll(pageno, pagesum);
    }

    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int Insert(House house){
        return houseMapper.insert(house);
    }

    public int Delete(Integer Houseid){
        return houseMapper.deleteByPrimaryKey(Houseid);
    }

    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int Update(House house){
        return houseMapper.updateByPrimaryKey(house);
    }

    public House queryById(Integer Houseid){
        return houseMapper.selectByPrimaryKey(Houseid);
    }

    public int selectRum(){
        return houseMapper.selectRum();
    }

    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int changeState(Integer houseid,Integer housestateid){
        return houseMapper.changeState(houseid, housestateid);
    }
}
