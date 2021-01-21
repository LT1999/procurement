package org.accp.procurement.service;


import org.accp.procurement.entity.Purchasedetail;

/**
 * 采购明细表服务接口
 *
 * @author LT
 * @since 2021-01-16 14:46:05
 * @description 
 */
public interface PurchasedetailService {
    /**
     * 新增采购明细表
     * @param record
     * @return int
     * */
    int insert(Purchasedetail record);
}
