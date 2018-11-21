package com.newer.sellhouse.service;

import com.newer.sellhouse.domain.Clientcontactcareful;
import com.newer.sellhouse.mapper.ClientcontactcarefulMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2018/11/21 0021.
 */
@Service
public class ClientContactCarefulService {

    @Autowired
    private ClientcontactcarefulMapper clientcontactcarefulMapper;

    /**
     * 添加客户明细信息
     * @param clientcontactcareful
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int addClientSh(Clientcontactcareful clientcontactcareful){
        return clientcontactcarefulMapper.insert(clientcontactcareful);
    }

    /**
     * 修改客户明细信息
     * @param clientcontactcareful
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int updClientSh(Clientcontactcareful clientcontactcareful){
        return clientcontactcarefulMapper.updateByPrimaryKey(clientcontactcareful);
    }

}
