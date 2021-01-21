package org.accp.procurement.web.controller;


import org.accp.procurement.entity.Productfile;
import org.accp.procurement.service.ProductfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productfile")
@CrossOrigin(methods = {RequestMethod.POST,RequestMethod.GET})
public class ProductfileController {

    @Autowired
    private ProductfileService productfileService;

    @RequestMapping("/selectProduct.do")
    public List<Productfile> selectProduct(){
        return this.productfileService.selectProduct();
    }


}
