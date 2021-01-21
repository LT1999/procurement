package org.accp.procurement.web.controller;

import org.accp.procurement.service.PurchasedetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 采购明细表服务控制器
 *
 * @author LT
 * @since 2021-01-16 14:46:05
 * @description 
 */
@RestController
@RequestMapping("/purchasedetail")
@CrossOrigin(methods = {RequestMethod.POST,RequestMethod.GET})
public class PurchasedetailController {
    @Autowired
    private PurchasedetailService purchasedetailService;


}