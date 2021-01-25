package org.accp.procurement.web.controller;

import org.accp.procurement.dto.supplierDto;
import org.accp.procurement.entity.Offer;
import org.accp.procurement.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 报价表服务控制器
 *
 * @author LT
 * @since 2021-01-16 14:46:04
 * @description
 */
@RestController
@CrossOrigin(methods = {RequestMethod.POST,RequestMethod.GET})
@RequestMapping("/offer")
public class OfferController{
    @Autowired
    private OfferService offerService;

    @RequestMapping("/selectAll")
    public List<Offer> selectAll(){
        return this.offerService.selectAll();
    }

    @RequestMapping("/findSupplierId")
    public List<Offer> findSupplierId(int supplierId){
        return this.offerService.findSupplierId(supplierId);
    }

    @RequestMapping("/delSupplierId")
    public String delSupplierId(int supplierId){
        this.offerService.delSupplierId(supplierId);
        return "true";
    }

    @RequestMapping("/insert")
    public Integer insert(supplierDto dto){
        System.out.println(dto.toString());

        return this.offerService.insert(dto);
    }

    @RequestMapping("/findsp")
    public List<Offer> findsp(){
        return this.offerService.findsp();
    }

    @RequestMapping("/selectAlloffer")
    public List<supplierDto> selectAlloffer(String goodsNo){
        return  this.offerService.selectAlloffer(goodsNo);
    }

    @RequestMapping("/findCheck")
    public List<Offer> findCheck(){
        return this.offerService.findCheck();
    }


    @RequestMapping("/updateByPrimaryKey")
    public int updateByPrimaryKey(Offer form){
        return this.offerService.updateByPrimaryKey(form);
    }

    @RequestMapping("/count1")
    public int count1(){ return this.offerService.countyi(); }
    @RequestMapping("/count2")
    public int count2(){
        return this.offerService.counter();
    }
    @RequestMapping("/count3")
    public int count3(){
        return this.offerService.countsan();
    }

    @RequestMapping("/selectwei")
    public List<Offer> selectwei(){
        return this.offerService.selectwei();
    }

    @RequestMapping("/countwei")
    public int countwei(){
        return this.offerService.countwei();
    }

    @RequestMapping("/deleteByPrimaryKey")
    public int deleteByPrimaryKey(int id){
        return this.offerService.deleteByPrimaryKey(id);
    }

    @RequestMapping("/findtime")
    public List<Offer> findtime(supplierDto dto){
        return this.offerService.findtime(dto);
    }

}