package org.accp.procurement.web.controller;

import org.accp.procurement.service.OfferService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 报价表服务控制器
 *
 * @author LT
 * @since 2021-01-16 14:46:04
 * @description 
 */
@RestController
@RequestMapping("/offer")
public class OfferController{
    private OfferService offerService;

}