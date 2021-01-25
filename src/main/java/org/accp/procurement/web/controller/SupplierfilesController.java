package org.accp.procurement.web.controller;

import org.accp.procurement.dto.supplierDto;
import org.accp.procurement.entity.Supplierfiles;
import org.accp.procurement.service.SupplierfilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
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
@CrossOrigin(methods = {RequestMethod.POST,RequestMethod.GET})
@RequestMapping("/supplierfiles")
public class SupplierfilesController {
    @Autowired
    private SupplierfilesService supplierfilesService;
    //查询已审核
    @RequestMapping("/findCheck")
    public List<Supplierfiles> findCheck(){
        return this.supplierfilesService.findCheck();
    }

    @RequestMapping("/selectByPrimaryKey")
    public Supplierfiles selectByPrimaryKey(int id){
        System.out.println(id);
        return this.supplierfilesService.selectByPrimaryKey(id);
    }

    @RequestMapping("/findss")
    public List<Supplierfiles> findss(supplierDto dto){
        return this.supplierfilesService.findss(dto);
    }
}