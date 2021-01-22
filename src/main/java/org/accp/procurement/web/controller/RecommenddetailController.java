package org.accp.procurement.web.controller;

import org.accp.procurement.entity.Recommenddetail;
import org.accp.procurement.service.RecommenddetailService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 推荐供应商明细服务控制器
 *
 * @author LT
 * @since 2021-01-16 14:46:05
 * @description 
 */
@RestController
@RequestMapping("/recommenddetail")
@CrossOrigin(methods = {RequestMethod.POST,RequestMethod.GET})
public class RecommenddetailController {
    @Autowired
    private RecommenddetailService recommenddetailService;

    @RequestMapping("/selectByProductNo")
    public List<Recommenddetail> selectByProductNo(String productNo){
        return this.recommenddetailService.selectByProductNo(productNo);
    }
}