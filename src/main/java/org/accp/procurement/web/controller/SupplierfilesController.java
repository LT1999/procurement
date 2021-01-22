package org.accp.procurement.web.controller;

import org.accp.procurement.entity.Supplierfiles;
import org.accp.procurement.service.SupplierfilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@CrossOrigin(methods = {RequestMethod.POST,RequestMethod.GET})
public class SupplierfilesController {
    @Autowired
    private SupplierfilesService supplierfilesService;

    @RequestMapping("/insert.do")
    public @ResponseBody Integer insert(Supplierfiles supplierfiles){
        return this.supplierfilesService.insert(supplierfiles);
    }
    @RequestMapping("/selectCheck.do")
    public  List<Supplierfiles> selectCheck(){
        return this.supplierfilesService.selectCheck();
    }

    @RequestMapping("/selectAll")
    public  List<Supplierfiles> selectAll(){
        return this.supplierfilesService.selectAll();
    }
}