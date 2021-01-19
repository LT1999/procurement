package org.accp.procurement.web.controller;

import org.accp.procurement.service.InvoiceService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 发票表服务控制器
 *
 * @author LT
 * @since 2021-01-16 14:46:04
 * @description 
 */

@RestController
@RequestMapping("/invoice")
public class InvoiceController {
    private InvoiceService invoiceService;

}