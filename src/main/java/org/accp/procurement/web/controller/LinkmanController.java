package org.accp.procurement.web.controller;

import org.accp.procurement.service.LinkmanService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

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
    private LinkmanService linkmanService;

}