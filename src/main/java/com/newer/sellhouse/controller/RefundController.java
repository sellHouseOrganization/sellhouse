package com.newer.sellhouse.controller;

import com.newer.sellhouse.domain.Admitbuy;
import com.newer.sellhouse.domain.Client;
import com.newer.sellhouse.domain.Refund;
import com.newer.sellhouse.mapper.AdmitbuyMapper;
import com.newer.sellhouse.mapper.ClientMapper;
import com.newer.sellhouse.service.RefundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("refund")
public class RefundController {
    @Autowired
    private RefundService refundService;

    @Autowired
    private ClientMapper clientMapper;
    @Autowired
    private AdmitbuyMapper admitbuyMapper;

    @RequestMapping(value = "sel", method = RequestMethod.GET)
    public ResponseEntity<?> selAll() {
        List<Refund> list = refundService.selAll();
        if (list.size() > 0) {
            return new ResponseEntity<>(list, HttpStatus.OK);
        }
        return new ResponseEntity<>("暂无数据或查询失败", HttpStatus.OK);
    }


    @RequestMapping(value = "ins", method = RequestMethod.GET)
    public ResponseEntity<?> insRefund(
            @RequestParam(name = "admitbuyid") Integer admitbuyid,
            @RequestParam(name = "takesum") Double takesum,
            @RequestParam(name = "refundsum") Double refundsum,
            @RequestParam(name = "refundexplain") String refundexplain,
            @RequestParam(name = "clientname") String clientname,
            @RequestParam(name = "cardnumber") String cardnumber

            ) {
        Refund refund = new Refund();
        refund.setAdmitbuyid(admitbuyid);
        refund.setTakesum(takesum);
        refund.setRefundsum(refundsum);
        refund.setRefundexplain(refundexplain);
        refund.setRefunddate(new Date());

         Admitbuy admitbuy =admitbuyMapper.selectByPrimaryKey(admitbuyid);
         Client client=clientMapper.selectByPrimaryKey(admitbuy.getClientid());
        //通过认购id验证用户名 和 身份证 是否正确
        if(clientname.equals(client.getClientName())&&cardnumber.equals(client.getCardnumber())){
            int ret = refundService.insRefund(refund,admitbuy);
            if (ret>0){
                return new ResponseEntity<>(ret, HttpStatus.OK);
            }
        }

        return new ResponseEntity<>("客户资料错误,无法操作", HttpStatus.OK);
    }
}
