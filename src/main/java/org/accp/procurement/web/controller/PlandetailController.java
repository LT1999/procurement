package org.accp.procurement.web.controller;

import org.accp.procurement.service.PlandetailService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 采购计划明细表服务控制器
 *
 * @author LT
 * @since 2021-01-16 14:46:04
 * @description 
 */
@RestController
@RequestMapping("/plandetail")
public class PlandetailController {
    private PlandetailService plandetailService;

}