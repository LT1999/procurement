package org.accp.procurement.web.controller;

import org.accp.procurement.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
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
@CrossOrigin(methods = {RequestMethod.POST,RequestMethod.GET})
public class InvoiceController {
    @Autowired
    private InvoiceService invoiceService;

}