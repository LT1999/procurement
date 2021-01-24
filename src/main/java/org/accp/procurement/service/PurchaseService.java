package org.accp.procurement.service;


import org.accp.procurement.dto.PurchaseDto;
import org.accp.procurement.entity.Purchase;

import java.util.List;

/**
 * 采购总表服务接口
 *
 * @author LT
 * @since 2021-01-16 14:46:04
 * @description 
 */
public interface PurchaseService {
    /**
     * 新增采购总表与采购明细表
     * @param purchaseDto
     * @return int
     * */
    int insert(PurchaseDto purchaseDto);

    /**
     * 查询采购总表未审核数据
     * @return List<Purchase>
     * */
    List<Purchase> selectCheck();

    /**
     * 修改采购总表
     * @param purchase
     * @return int
     * */
    Integer updateByPrimaryKey(Purchase purchase);

    /**
     * 查询所有采购总表数据
     * @return List<Purchase>
     * */
    List<Purchase> selectAll();

    /**
     * 查询采购总表未质检的数据
     * @return List<Purchase>
     * */
    List<Purchase> selectQuality();
}
