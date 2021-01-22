package org.accp.procurement.service.impl;

import org.accp.procurement.entity.Purchasedetail;
import org.accp.procurement.mapper.PurchasedetailMapper;
import org.accp.procurement.service.PurchasedetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 采购明细表服务接口实现
 *
 * @author LT
 * @since 2021-01-16 14:46:05
 * @description 
 */
@Service
public class PurchasedetailServiceImpl implements PurchasedetailService {
    @Autowired
    private PurchasedetailMapper purchasedetailMapper;
    @Override
    public int insert(Purchasedetail record) {
        return this.purchasedetailMapper.insert(record);
    }
}