package com.newer.sellhouse.service;

import com.newer.sellhouse.domain.Client;
import com.newer.sellhouse.domain.Clientcontactcareful;
import com.newer.sellhouse.mapper.ClientMapper;
import com.newer.sellhouse.mapper.ClientcontactcarefulMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Created by Administrator on 2018/11/19 0019.
 */
@Service
public class ClientService {

    @Autowired
    private ClientcontactcarefulMapper clientcontactcarefulMapper;
    @Autowired
    private ClientMapper clientMapper;

    /**
     * 查询所有信息
     * @return
     */
    public List<Clientcontactcareful> findAll(){
        return clientcontactcarefulMapper.selectAll();
    }

    /**
     * 删除修改
     * @param clientid
     * @return
     */
    public int delClient(Integer clientid){
        return clientMapper.deleteByPrimaryKey(clientid);
    }

    /**
     * 添加信息
     * @param client
     * @return
     */
    public int addClient(Client client){
        return clientMapper.insert(client);
    }

    /**
     * 修改信息
     * @param client
     * @return
     */
    public int updClient(Client client){
        return clientMapper.updateByPrimaryKey(client);
    }
}
