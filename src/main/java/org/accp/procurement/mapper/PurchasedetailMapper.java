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

    int updateByPrimaryKey(Purchasedetail record);
}