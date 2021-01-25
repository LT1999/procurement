package org.accp.procurement.mapper;

import java.util.List;
import org.accp.procurement.entity.Purchasedetail;

public interface PurchasedetailMapper {
    int deleteByPrimaryKey(Integer id);
    /**
     * 新增采购明细表
     * @param record
     * @return int
     * */
    int insert(Purchasedetail record);

    Purchasedetail selectByPrimaryKey(Integer id);

    List<Purchasedetail> selectAll();
    /**
     * 根据id修改采购明细表
     * @param record
     * @return int
     * */
    int updateByPrimaryKey(Purchasedetail record);

    /**
     * 根据父id查询采购明细表
     * @param parentId 父id
     * @return List<Purchasedetail> 采购明细表集合
     * */
    List<Purchasedetail> selectByParentId(Integer parentId);
}