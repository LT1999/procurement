package org.accp.procurement.service.impl;

import org.accp.procurement.entity.Plandetail;
import org.accp.procurement.mapper.PlandetailMapper;
import org.accp.procurement.service.PlandetailService;
import org.accp.procurement.service.PurchaseqplanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 采购计划明细表服务接口实现
 *
 * @author LT
 * @since 2021-01-16 14:46:04
 * @description 
 */
@Service
public class PlandetailServiceImpl implements PlandetailService {
    /** 采购计划明细表Mapper接口*/
    @Autowired
    private PlandetailMapper plandetailMapper;
    /** 采购计划明细表Mapper接口*/
    @Autowired
    private PurchaseqplanService purchaseqplanService;

    @Override
    public List<Plandetail> selectAllByParentId(Integer parentId) {
        return this.plandetailMapper.selectAllByParentId(parentId);
    }
    @Override
    public List<Plandetail> selectAllAndPurchaseqplan() {
        List<Plandetail> plandetailList = this.plandetailMapper.selectDispatch();
        for (Plandetail plandetail:
                plandetailList) {
            plandetail.setPurchaseqplan(this.purchaseqplanService.selectByPrimaryKey(plandetail.getParentId()));
        }
        return plandetailList;
    }

    @Override
    public int updateDispatch(String dispatch, Integer purchaseqplanId) {
        return this.plandetailMapper.updateDispatch(dispatch,purchaseqplanId);
    }
}