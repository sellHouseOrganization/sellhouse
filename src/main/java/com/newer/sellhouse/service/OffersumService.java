package com.newer.sellhouse.service;

import com.newer.sellhouse.domain.Admitbuy;
import com.newer.sellhouse.domain.Housesumcollect;
import com.newer.sellhouse.domain.Offersum;
import com.newer.sellhouse.domain.Promptnotesregister;
import com.newer.sellhouse.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OffersumService {
    @Autowired
    private AdmitbuyMapper admitbuyMapper;

    @Autowired
    private OffersumMapper offersumMapper;

    @Autowired
    private HousesumcollectMapper housesumcollectMapper;

    @Autowired
    private PromptnotesregisterMapper promptnotesregisterMapper;

    public List<Admitbuy> selectAdmitBuyByClientNameHouseName(String clientName, String houseName) {
        return admitbuyMapper.selectAdmitBuyByClientNameHouseName(clientName, houseName);
    }

    public List<Offersum> findbyadmitbuyid(Integer admitbuyid) {
        return offersumMapper.findbyadmitbuyid(admitbuyid);
    }

    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int addhousesumcollect(Housesumcollect housesumcollect) {
        Integer offersumid = housesumcollect.getOffersumid();
        int i = offersumMapper.updatealreadypayaddone(offersumid);
        int i1 = housesumcollectMapper.insert(housesumcollect);
        return i+i1;
    }

    public Housesumcollect findByoffersumidoffertime(Integer offersumid,Integer offertime){
        return housesumcollectMapper.findByoffersumidoffertime(offersumid,offertime);
    }

    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int addprompt(Promptnotesregister promptnotesregister){
            return  promptnotesregisterMapper.insert(promptnotesregister);
    }
}
