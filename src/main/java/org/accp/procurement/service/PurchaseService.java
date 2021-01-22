package org.accp.procurement.service;


import org.accp.procurement.dto.PurchaseDto;
import org.accp.procurement.entity.Purchase;

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
}
