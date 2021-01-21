package org.accp.procurement.service.impl;

import org.accp.procurement.dto.PurchaseDto;
import org.accp.procurement.entity.Purchase;
import org.accp.procurement.entity.Purchasedetail;
import org.accp.procurement.entity.Purchaseqplan;
import org.accp.procurement.mapper.PurchaseMapper;
import org.accp.procurement.mapper.PurchaseqplanMapper;
import org.accp.procurement.service.PurchaseService;
import org.accp.procurement.service.PurchasedetailService;
import org.accp.procurement.service.PurchaseqplanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 采购总表服务接口实现
 *
 * @author LT
 * @since 2021-01-16 14:46:04
 * @description 
 */
@Service
public  class PurchaseServiceImpl implements PurchaseService {
    /**
     * 采购总表Mapper接口
     */
    @Autowired
    private PurchaseMapper purchaseMapper;
    @Autowired
    private PurchasedetailService purchasedetailService;

    @Override
    public int insert(PurchaseDto purchaseDto) {
        Integer count=0;

        Integer id=this.purchaseMapper.insert(purchaseDto.getPurchase());
        for (Purchasedetail purchasedetail:
             purchaseDto.getPurchasedetailList()) {
            purchasedetail.setParentId(id);
           count += this.purchasedetailService.insert(purchasedetail);
        }

        return count;
    }
}