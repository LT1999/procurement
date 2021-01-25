package org.accp.procurement.web.controller;

import org.accp.procurement.entity.Linkman;
import org.accp.procurement.service.LinkmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 联系人信息表服务控制器
 *
 * @author LT
 * @since 2021-01-16 14:46:04
 * @description 
 */

@RestController
@RequestMapping("/linkman")
@CrossOrigin(methods = {RequestMethod.POST,RequestMethod.GET})
public class LinkmanController {
    @Autowired
    private LinkmanService linkmanService;

    //根据ID查询
    @RequestMapping("/selectByPrimaryKey")
    public Linkman selectByPrimaryKey(int id){
        System.out.println(id+"---------------");
        return this.linkmanService.selectByPrimaryKey(id);
    }
    @RequestMapping("/insert")
    public Integer insert(Linkman [] linkman){
        //int count=0;
        for (int i = 0; i < linkman.length; i++) {
            System.out.println(linkman[i].getLinkmanSex());
        }
        return 0;
    }
}