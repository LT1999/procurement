package org.accp.procurement.web.controller;

import org.accp.procurement.service.SupplierfilesService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 供应商档案表服务控制器
 *
 * @author LT
 * @since 2021-01-16 14:46:05
 * @description 
 */
@RestController
@RequestMapping("/supplierfiles")
public class SupplierfilesController {
    private SupplierfilesService supplierfilesService;

}