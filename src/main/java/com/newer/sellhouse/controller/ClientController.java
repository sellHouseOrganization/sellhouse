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

import java.util.Date;
import java.util.List;

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
     * 模糊查询and查询所有信息
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
    public ResponseEntity<?> addClient(@RequestParam(name="clientName")String clientName,
                                       @RequestParam(name="sex")String sex,
                                       @RequestParam(name="cardnumber")String cardnumber,
                                       @RequestParam(name="age")String age,
                                       @RequestParam(name="phone")String phone){

        Client client=new Client();
        client.setClientName(clientName);
        client.setSex(sex);
        client.setCardnumber(cardnumber);
        client.setAge(age);
        client.setPhone(phone);
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
    public ResponseEntity<?> AddClients(@RequestParam(name="email")String email,
                                        @RequestParam(name="contactWay")String contactWay,
                                        @RequestParam(name="purposeDegree")String purposeDegree,
                                        @DateTimeFormat(pattern = "yyyy-MM-dd")
                                        @RequestParam(name="interviewDate")Date interviewDate,
                                        @RequestParam(name="messageAddress")String messageAddress,
                                        @RequestParam(name="aim")String aim,
                                        @RequestParam(name="payWay")String payWay,
                                        @RequestParam(name="houseMortgageLoan")String houseMortgageLoan,
                                        @RequestParam(name="projectPrice")String projectPrice,
                                        @RequestParam(name="needArea")String needArea,
                                        @RequestParam(name="considerFactor")String considerFactor
                                       ){
        Clientcontactcareful clientcontactcareful=new Clientcontactcareful();
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
        clientcontactcareful.setConsiderFactor(considerFactor);

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
