package org.accp.procurement.service.impl;


import org.accp.procurement.entity.Purchaseqplan;
import org.accp.procurement.mapper.PlandetailMapper;
import org.accp.procurement.mapper.PurchaseMapper;
import org.accp.procurement.mapper.PurchaseqplanMapper;
import org.accp.procurement.service.PlandetailService;
import org.accp.procurement.service.PurchaseqplanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 采购计划表服务接口实现
 *
 * @author LT
 * @since 2021-01-16 14:46:05
 * @description 
 */
@Service
public class PurchaseqplanServiceImpl implements PurchaseqplanService {
    /**
     * 采购计划表Mapper接口
     */
    @Autowired
    private PurchaseqplanMapper purchaseqplanMapper;
    /**
     * 采购计划明细表服务接口
     */
    @Autowired
    private PlandetailService plandetailService;

    @Override
    public Purchaseqplan selectByPrimaryKey(Integer id) {
        return this.purchaseqplanMapper.selectByPrimaryKey(id);
    }
}