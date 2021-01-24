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
    /**
     * 查询所有采购总表数据
     * @return List<Purchase>
     * */
    List<Purchase> selectAll();
    /**
     * 修改采购总表
     * @param purchase
     * @return int
     * */
    int updateByPrimaryKey(Purchase purchase);
    /**
     * 获取下一个自增主键
     * @return int
     * */
    int getId();

    /**
     * 查询采购总表未审核数据
     * @return List<Purchase>
     * */
    List<Purchase> selectCheck();

    /**
     * 查询采购总表未质检的数据
     * @return List<Purchase>
     * */
    List<Purchase> selectQuality();
}