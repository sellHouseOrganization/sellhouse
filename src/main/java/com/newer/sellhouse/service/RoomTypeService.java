package com.newer.sellhouse.service;

import com.newer.sellhouse.domain.Roomtype;
import com.newer.sellhouse.mapper.RoomtypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomTypeService {
    @Autowired
    private RoomtypeMapper roomtypeMapper;

    public List<Roomtype>roomtypeList(){
        return roomtypeMapper.selectAll();
    }
}
