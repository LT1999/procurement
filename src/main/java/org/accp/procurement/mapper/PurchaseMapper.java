package org.accp.procurement.mapper;

import java.util.List;
import org.accp.procurement.entity.Purchase;

public interface PurchaseMapper {
    int deleteByPrimaryKey(Integer id);
    /**
     * 新增采购总表
     * @param record
     * @return int
     * */
    int insert(Purchase record);

    Purchase selectByPrimaryKey(Integer id);

    List<Purchase> selectAll();

    int updateByPrimaryKey(Purchase record);
    /**
     * 获取下一个自增主键
     * @return int
     * */
    int getId();
}