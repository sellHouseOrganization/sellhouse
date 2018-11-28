package com.newer.sellhouse.controller;

import com.newer.sellhouse.domain.Client;
import com.newer.sellhouse.domain.Clientcontactcareful;
import com.newer.sellhouse.service.ClientContactCarefulService;
import com.newer.sellhouse.service.ClientService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created by Administrator on 2018/11/19 0019.
 */
@RestController
@RequestMapping("Client")
public class ClientController {

    @Autowired
    private ClientService clientService;
    @Autowired
    private ClientContactCarefulService clientContactCarefulService;

    /**
     * 模糊查询and查询两表信息
     * @param cardnumber
     * @return
     */
    @RequestMapping(value = "list",method = RequestMethod.GET)
    public ResponseEntity<?> findAll(@RequestParam(name="cardnumber",required = false)String cardnumber){
        List<Clientcontactcareful> clientList=clientService.findAll(cardnumber);
        if(clientList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(clientList,HttpStatus.OK);
    }

    /**
     * 删除客户信息
     * @param clientContactCarefulid
     * @return
     */
    @RequestMapping(value = "client/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> delClient(@PathVariable(name="id")Integer clientContactCarefulid){
        int ret=clientContactCarefulService.delClientSh(clientContactCarefulid);
        if(ret>0){
            return new ResponseEntity<>(ret,HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    /**
     * 添加客户信息
     * @param
     * @return
     */
    @RequestMapping(value = "addClient",method =RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> addClient(@RequestParam(name="clientName",required = false)String clientName,
                                       @RequestParam(name="sex",required = false)String sex,
                                       @RequestParam(name="cardnumber",required = false)String cardnumber,
                                       @RequestParam(name="age",required = false)String age,
                                       @RequestParam(name="phone",required = false)String phone){

        Client client=new Client();
        client.setClientName(clientName);
        client.setSex(sex);
        client.setCardnumber(cardnumber);
        client.setAge(age);
        client.setPhone(phone);
        int result=5;
        //Random random=new Random();
        for(int i=0;i<3;i++){
            result+=result;
        }
        client.setClientid(result);
        System.out.println(clientName);
        int ret=clientService.addClient(client);
        if(ret>0){
            return new ResponseEntity<>(ret,HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    /**
     * 修改客户信息
     * @param client
     * @return
     */
    @RequestMapping(value = "addClient",method =RequestMethod.PUT)
    public ResponseEntity<?> updClient(@RequestBody Client client){
        int ret=clientService.updClient(client);
        if(ret>0){
            return new ResponseEntity<>(ret,HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    /**
     * 添加客户明细信息
     * @param
     * @return
     */
    @RequestMapping(value = "AddClients",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> AddClients(@RequestParam(value="email",required = false)String email,
                                        @RequestParam(name="contactWay",required = false)String contactWay,
                                        @RequestParam(name="purposeDegree",required = false)String purposeDegree,
                                        @DateTimeFormat(pattern = "yyyy-MM-dd")
                                        @RequestParam(name="interviewDate",required = false)Date interviewDate,
                                        @RequestParam(name="messageAddress",required = false)String messageAddress,
                                        @RequestParam(name="aim",required = false)String aim,
                                        @RequestParam(name="payWay",required = false)String payWay,
                                        @RequestParam(name="houseMortgageLoan",required = false)String houseMortgageLoan,
                                        @RequestParam(name="projectPrice",required = false)String projectPrice,
                                        @RequestParam(name="needArea",required = false)String needArea,
                                        @RequestParam(name="considerFactor",required = false)String considerFactor
                                       ){
        Clientcontactcareful clientcontactcareful=new Clientcontactcareful();
        clientcontactcareful.setConsiderFactor(considerFactor);
        clientcontactcareful.setEmail(email);
        clientcontactcareful.setContactWay(contactWay);
        clientcontactcareful.setPurposeDegree(purposeDegree);
        clientcontactcareful.setInterviewDate(interviewDate);
        clientcontactcareful.setMessageAddress(messageAddress);
        clientcontactcareful.setAim(aim);
        clientcontactcareful.setHouseMortgageLoan(houseMortgageLoan);
        clientcontactcareful.setProjectPrice(projectPrice);
        clientcontactcareful.setNeedArea(needArea);
        clientcontactcareful.setPayWay(payWay);

        int result=5;
        //Random random=new Random();
        for(int i=0;i<3;i++){
            result+=result;
        }
        clientcontactcareful.setClientid(result);

        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHH");
       /* String newDate=sdf.format(new Date());

      System.out.println(result);
        int id= Integer.parseInt(newDate);*/
        //clientcontactcareful.setClientid(result);

        //System.out.println(id);

        int ret=clientContactCarefulService.addClientSh(clientcontactcareful);
        if(ret>0){
            return new ResponseEntity<>(ret,HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }



    /**
     * 修改客户明细信息
     * @param clientcontactcareful
     * @return
     */
    @RequestMapping(value = "updClients",method = RequestMethod.PUT)
    public ResponseEntity<?> updClients(@RequestBody Clientcontactcareful clientcontactcareful){
        int ret=clientContactCarefulService.updClientSh(clientcontactcareful);
        if(ret>0){
            return new ResponseEntity<>(ret,HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

}
