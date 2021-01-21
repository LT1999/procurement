package org.accp.procurement.service.impl;



import org.accp.procurement.entity.Offer;
import org.accp.procurement.mapper.OfferMapper;
import org.accp.procurement.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 报价表服务接口实现
 *
 * @author LT
 * @since 2021-01-16 14:46:04
 * @description 
 */

@Service
public class OfferServiceImpl implements OfferService {
@Autowired
private OfferMapper offerMapper;

    @Override
    public List<Offer> findSupplierId(int supplierId) {
        return this.offerMapper.findSupplierId(supplierId);
    }

    @Override
    public List<Offer> selectAll() {
        return this.offerMapper.selectAll();
    }
}