package org.accp.procurement.service;


import org.accp.procurement.dto.PurchaseqplanDto;
import org.accp.procurement.entity.Purchaseqplan;

/**
 * 采购计划表服务接口
 *
 * @author LT
 * @since 2021-01-16 14:46:05
 * @description 
 */
public interface PurchaseqplanService {
    /**
     * 根据id查询计划表
     * @param id
     * @return Purchaseqplan
     * */
    Purchaseqplan selectByPrimaryKey(Integer id);

    //添加采购计划表
    void insertPruchaseqplan(PurchaseqplanDto purchaseqplanDto);

}
