package org.accp.procurement.web.controller;

import org.accp.procurement.dto.RecommendDto;
import org.accp.procurement.entity.Recommend;
import org.accp.procurement.service.RecommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 推荐供应商服务控制器
 *
 * @author LT
 * @since 2021-01-16 14:46:05
 * @description 
 */
@RestController
@RequestMapping("/recommend")
@CrossOrigin(methods = { RequestMethod.POST, RequestMethod.GET })
public class RecommendController {
    @Autowired
    private RecommendService recommendService;

    @RequestMapping("/InsertRecommend")
    public void InsertRecommend(RecommendDto recommendDto) {
        this.recommendService.InsertRecommend(recommendDto);
    }

    @RequestMapping("/selectAllByCheck")
    public List<Recommend> selectAllByCheck(){
      return  this.recommendService.selectAllByCheck();
    }

    @RequestMapping("/updateByPrimaryKey")
    public int updateByPrimaryKey(Recommend record){
        return  this.recommendService.updateByPrimaryKey(record);
    }

    @RequestMapping("/selectAll")
    public List<Recommend> selectAll(){
        return  this.recommendService.selectAll();
    }

    @RequestMapping("/updateByPrimaryKey2")
    public int updateByPrimaryKey2(RecommendDto recommendDto){
        return this.recommendService.updateByPrimaryKey2(recommendDto);
    }

}