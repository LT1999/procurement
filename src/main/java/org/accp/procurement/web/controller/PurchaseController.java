package org.accp.procurement.web.controller;

import org.accp.procurement.dto.PurchaseDto;
import org.accp.procurement.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

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
}