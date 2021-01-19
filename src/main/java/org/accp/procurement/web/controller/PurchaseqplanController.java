package org.accp.procurement.web.controller;

import org.accp.procurement.service.PurchaseqplanService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 采购计划表服务控制器
 *
 * @author LT
 * @since 2021-01-16 14:46:05
 * @description 
 */

@RestController
@RequestMapping("/purchaseqplan")
public class PurchaseqplanController {
    private PurchaseqplanService purchaseqplanService;

}