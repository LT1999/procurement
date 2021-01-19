package org.accp.procurement.web.controller;

import org.accp.procurement.service.RecommendService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 推荐供应商服务控制器
 *
 * @author LT
 * @since 2021-01-16 14:46:05
 * @description 
 */
@RestController
@RequestMapping("/recommend")
public class RecommendController {
    private RecommendService recommendService;

}