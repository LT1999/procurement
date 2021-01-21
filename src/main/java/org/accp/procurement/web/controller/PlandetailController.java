package org.accp.procurement.web.controller;

import org.accp.procurement.entity.Plandetail;
import org.accp.procurement.service.PlandetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 采购计划明细表服务控制器
 *
 * @author LT
 * @since 2021-01-16 14:46:04
 * @description 
 */
@RestController
@RequestMapping("/plandetail")
@CrossOrigin(methods = {RequestMethod.POST,RequestMethod.GET})
public class PlandetailController {
    @Autowired
    private PlandetailService plandetailService;

    /*@RequestMapping("/selectAllAndPurchaseqplan")
    public List<Plandetail> selectAllAndPurchaseqplan(){
        return this.plandetailService.selectAllAndPurchaseqplan();
    }*/
}