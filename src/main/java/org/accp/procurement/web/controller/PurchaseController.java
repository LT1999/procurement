package org.accp.procurement.web.controller;

import org.accp.procurement.dto.PurchaseDto;
import org.accp.procurement.entity.Purchase;
import org.accp.procurement.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 采购总表服务控制器
 *
 * @author LT
 * @since 2021-01-16 14:46:04
 * @description 
 */
@RestController
@RequestMapping("/purchase")
@CrossOrigin(methods = {RequestMethod.POST,RequestMethod.GET})
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;

    /**
     * 新增采购总表与采购明细表
     * @param purchaseDto
     * @return int
     * */
    @RequestMapping("/insert")
    public Integer insert(PurchaseDto purchaseDto){
        return this.purchaseService.insert(purchaseDto);
    }
    /**
     * 查询采购总表未审核数据
     * @return List<Purchase>
     * */
    @RequestMapping("/selectCheck")
    public List<Purchase> selectCheck(){
        return this.purchaseService.selectCheck();
    }
    /**
     * 修改采购总表
     * @param purchase
     * @return int
     * */
    @RequestMapping("/updateByPrimaryKey")
    public Integer updateByPrimaryKey(Purchase purchase){
        return this.purchaseService.updateByPrimaryKey(purchase);
    }
    /**
     * 查询所有采购总表数据
     * @return List<Purchase>
     * */
    @RequestMapping("/selectAll")
    public List<Purchase> selectAll(){
        return this.purchaseService.selectAll();
    }

    /**
     * 查询采购总表未质检的数据
     * @return List<Purchase>
     **/
    @RequestMapping("/selectQuality")
    public List<Purchase> selectQuality(){
        return this.purchaseService.selectQuality();
    }
}