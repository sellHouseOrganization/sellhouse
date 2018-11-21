package com.newer.sellhouse.service;

import com.newer.sellhouse.domain.Client;
import com.newer.sellhouse.domain.Clientcontactcareful;
import com.newer.sellhouse.mapper.ClientMapper;
import com.newer.sellhouse.mapper.ClientcontactcarefulMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2018/11/19 0019.
 */
@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true,rollbackFor = Exception.class)
public class ClientService {

    @Autowired
    private ClientcontactcarefulMapper clientcontactcarefulMapper;
    @Autowired
    private ClientMapper clientMapper;

    /**
     * (模糊)查询两表信息
     * @return
     */
    public List<Clientcontactcareful> findAll(@Param("cardnumber")String cardnumber){
        return clientcontactcarefulMapper.selectAll(cardnumber);
    }

    /**
     * 删除客户信息
     * @param clientid
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int delClient(Integer clientid){
        return clientMapper.deleteByPrimaryKey(clientid);
    }

    /**
     * 添加客户信息
     * @param client
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int addClient(Client client){
        return clientMapper.insert(client);
    }

    /**
     * 修改客户信息
     * @param client
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int updClient(Client client){
        return clientMapper.updateByPrimaryKey(client);
    }
}
