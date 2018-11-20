package com.newer.sellhouse.service;

import com.newer.sellhouse.domain.Floor;
import com.newer.sellhouse.mapper.FloorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FloorService {
    @Autowired
    private FloorMapper floorMapper;

    public List<Floor>selectAll(){
        return floorMapper.selectAll();
    }

    public int Insert(Floor floor){
        return floorMapper.insert(floor);
    }

    public int Delete(Integer floorid){
        return floorMapper.deleteByPrimaryKey(floorid);
    }

    public int Update(Floor floor){
        return floorMapper.updateByPrimaryKey(floor);
    }

    public Floor queryById(Integer floorid){
        return floorMapper.selectByPrimaryKey(floorid);
    }

    public int changeNotOut(Integer floorid,Integer notout){
        return floorMapper.changeNotOut(floorid, notout);
    }
    public int changeNotApertura(Integer floorid,Integer notapertura){
        return floorMapper.changeNotApertura(floorid, notapertura);
    }
}
