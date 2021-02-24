package org.accp.procurement.web.controller;

import org.accp.procurement.dto.selsupDto;
import org.accp.procurement.dto.supplierDto;
import org.accp.procurement.entity.Offer;
import org.accp.procurement.entity.Serial;
import org.accp.procurement.entity.Supplierfiles;
import org.accp.procurement.service.OfferService;
import org.accp.procurement.service.RecommenddetailService;
import org.accp.procurement.service.SerialService;
import org.accp.procurement.service.SupplierfilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
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
    @Autowired
    private OfferService offerService;
    @Autowired
    private RecommenddetailService recommenddetailService;
    @Autowired
    private SerialService serialService;



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
    public Integer insert(Supplierfiles ruleForm){
        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(simpleDateFormat.format(date));
        Serial serial=new Serial();
        serial.setId(this.supplierfilesService.getId());
        serial.setYi(ruleForm.getFirstKindId().toString());
        serial.setEr(ruleForm.getSecondKindId().toString());
        serial.setSan(ruleForm.getThreeKindId().toString());
        serial.setTime(simpleDateFormat.format(date));
        ruleForm.setSupplierNo(this.serialService.supplierNo(serial));
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
        if(searchFrom!=null){
            if(searchFrom.getQueryTime()!=null&&searchFrom.getQueryTime().length!=0 ){
                dto.setStarttime(searchFrom.getQueryTime()[0]);
                dto.setEndtime(searchFrom.getQueryTime()[1]);

            }
            if(searchFrom.getQueryClassifyId()!=null && searchFrom.getQueryClassifyId().length!=0){
                dto.setFirstKindId(searchFrom.getQueryClassifyId()[0]);
                dto.setSecondKindId(searchFrom.getQueryClassifyId()[1]);
                dto.setThreeKindId(searchFrom.getQueryClassifyId()[2]);
            }
            if(searchFrom.getType()!=null && searchFrom.getType().toString().length()!=0){
                dto.setType(searchFrom.getType().toString());
            }

        }

        return this.supplierfilesService.selectChang(dto);
    }
    @RequestMapping("/delByid")
    public  Integer delByid(Supplierfiles row){
        System.out.println(row.getId());
        List<Offer> list=this.offerService.findSupplierId(row.getId());
        int count=0;
        for (int i = 0; i <list.size() ; i++) {
            this.recommenddetailService.delByOfferId(list.get(i).getId());
        }
        this.offerService.delSupplierId(row.getId());
        //System.out.println("2222222222222222222222"+this.supplierfilesService.deleteByPrimaryKey(row.getId()));
        return this.supplierfilesService.deleteByPrimaryKey(row.getId());

    }


}