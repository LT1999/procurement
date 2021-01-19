package org.accp.procurement.web.controller;

import org.accp.procurement.service.PurchasedetailService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 采购明细表服务控制器
 *
 * @author LT
 * @since 2021-01-16 14:46:05
 * @description 
 */
@RestController
@RequestMapping("/purchasedetail")
public class PurchasedetailController {
    private PurchasedetailService purchasedetailService;

}