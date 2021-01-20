package org.accp.procurement.web.controller;

import org.accp.procurement.entity.Supplierfiles;
import org.accp.procurement.service.SupplierfilesService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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
    //查询已审核
    @RequestMapping("/findCheck.do")
    public List<Supplierfiles> findCheck(){
        return this.supplierfilesService.findCheck();
    }
}