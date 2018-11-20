package com.newer.sellhouse.service;

import com.newer.sellhouse.domain.Admitbuy;
import com.newer.sellhouse.domain.Client;
import com.newer.sellhouse.domain.Renames;
import com.newer.sellhouse.mapper.AdmitbuyMapper;
import com.newer.sellhouse.mapper.ClientMapper;
import com.newer.sellhouse.mapper.RenameMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class RenameService {
    @Autowired
    private RenameMapper renameMapper;
    @Autowired
    private AdmitbuyMapper admitbuyMapper;
    @Autowired
    private ClientMapper clientMapper;

    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int updRename(Admitbuy admitbuy,Integer oldclientid){
        Renames renames=new Renames();
        renames.setRenamedate(new Date());
        renames.setAdmitbuyid(admitbuy.getAdmitbuyid());
        renames.setOldclientid(oldclientid);
        renames.setNewclientid(admitbuy.getClientid());
        renameMapper.insert(renames);
        return admitbuyMapper.updRename(admitbuy);
    }

    /***
     * 根据id查对象
     * @param id
     * @return
     */
    public Client selbyid(int id){
        return clientMapper.selectByPrimaryKey(id);
    }
    public List<Renames> selAll(){
        return renameMapper.selAll();
    }
}
