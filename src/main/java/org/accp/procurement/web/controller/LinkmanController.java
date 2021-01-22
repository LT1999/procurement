package org.accp.procurement.web.controller;

import org.accp.procurement.service.LinkmanService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

import org.accp.procurement.entity.Linkman;
import org.accp.procurement.entity.Supplierfiles;

/**
 * 联系人信息表服务控制器
 *
 * @author LT
 * @since 2021-01-16 14:46:04
 * @description 
 */

@RestController
@CrossOrigin(methods = {RequestMethod.POST,RequestMethod.GET})
@RequestMapping("/linkman")
public class LinkmanController {
    private LinkmanService linkmanService;

    //根据ID查询
    @RequestMapping("/selectByPrimaryKey")
    public Linkman selectByPrimaryKey(int id){
        return this.linkmanService.selectByPrimaryKey(id);
    }
}