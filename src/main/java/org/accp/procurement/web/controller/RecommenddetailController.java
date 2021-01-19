package org.accp.procurement.web.controller;

import org.accp.procurement.service.RecommenddetailService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 推荐供应商明细服务控制器
 *
 * @author LT
 * @since 2021-01-16 14:46:05
 * @description 
 */
@RestController
@RequestMapping("/recommenddetail")
public class RecommenddetailController {
    private RecommenddetailService recommenddetailService;

}