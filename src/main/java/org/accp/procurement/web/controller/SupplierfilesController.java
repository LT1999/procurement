package org.accp.procurement.web.controller;

import org.accp.procurement.dto.selsupDto;
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
    @RequestMapping("/insert")
    public @ResponseBody Integer insert(Supplierfiles ruleForm){

        /*ruleForm.getSupplierRegistrationtime();*/
        return this.supplierfilesService.insert(ruleForm);
    }
    @RequestMapping("/selectCheck")
    public  List<Supplierfiles> selectCheck(){
        return this.supplierfilesService.selectCheck();
    }

    @RequestMapping("/selectAll")
    public  List<Supplierfiles> selectAll(){
        return this.supplierfilesService.selectAll();
    }

    @RequestMapping("/selectCount")
    public  Integer selectCount(){
        return this.supplierfilesService.selectCount();
    }

    @RequestMapping("/updateByPrimaryKey")
    public  Integer updateByPrimaryKey(Supplierfiles Form){
        return this.supplierfilesService.updateByPrimaryKey(Form);
    }

    @RequestMapping("/selectChang")
    public List<Supplierfiles> selectChang(selsupDto searchFrom) {
        //System.out.println(searchFrom.getQueryClassifyId()[0].toString());
        selsupDto dto = new selsupDto();
        if(searchFrom.getQueryTime().length!=0 & searchFrom.getQueryClassifyId().length!=0){
            dto.setStarttime(searchFrom.getQueryTime()[0]);
            dto.setEndtime(searchFrom.getQueryTime()[1]);
            dto.setFirstKindId(searchFrom.getQueryClassifyId()[0]);
            dto.setSecondKindId(searchFrom.getQueryClassifyId()[1]);
            dto.setThreeKindId(searchFrom.getQueryClassifyId()[2]);

        }
        dto.setType(searchFrom.getType());
        return this.supplierfilesService.selectChang(dto);
    }

}