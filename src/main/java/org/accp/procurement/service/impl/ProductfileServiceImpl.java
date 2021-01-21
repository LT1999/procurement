package org.accp.procurement.service.impl;

import org.accp.procurement.entity.Productfile;
import org.accp.procurement.mapper.ProductfileMapper;
import org.accp.procurement.service.ProductfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductfileServiceImpl implements ProductfileService {

    @Autowired
    private ProductfileMapper  productfileMapper;

    @Override
    public List<Productfile> selectProduct() {
        return this.productfileMapper.selectProduct();
    }
}
