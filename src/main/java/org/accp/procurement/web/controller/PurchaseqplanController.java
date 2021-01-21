package org.accp.procurement.web.controller;

import org.accp.procurement.entity.Purchaseqplan;
import org.accp.procurement.service.PurchaseqplanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 采购计划表服务控制器
 *
 * @author LT
 * @since 2021-01-16 14:46:05
 * @description 
 */

@RestController
@RequestMapping("/purchaseqplan")
@CrossOrigin(methods = {RequestMethod.POST,RequestMethod.GET})
public class PurchaseqplanController {
    @Autowired
    private PurchaseqplanService purchaseqplanService;



}