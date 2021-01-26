package org.accp.procurement.service;


import org.accp.procurement.entity.Purchasedetail;

import java.util.List;

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
    /**
     * 根据父id查询采购明细表
     * @param parentId 父id
     * @return List<Purchasedetail> 采购明细表集合
     * */
    List<Purchasedetail> selectByParentId(Integer parentId);
    /**
     * 根据id修改采购明细表
     * @param record
     * @return int
     * */
    int updateByPrimaryKey(Purchasedetail record);

}
