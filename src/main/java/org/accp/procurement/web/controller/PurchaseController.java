package org.accp.procurement.web.controller;

import org.accp.procurement.service.PurchaseService;
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
public class PurchaseController {
    private PurchaseService purchaseService;

}