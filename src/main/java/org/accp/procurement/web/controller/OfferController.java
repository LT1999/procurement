package org.accp.procurement.web.controller;

import org.accp.procurement.dto.supplierDto;
import org.accp.procurement.entity.Offer;
import org.accp.procurement.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String insert(supplierDto dto){
        System.out.println(dto.toString());
        this.offerService.insert(dto);
        return "true";
    }

    @RequestMapping("/findsp")
    public List<Offer> findsp(){
        return this.offerService.findsp();
    }
}