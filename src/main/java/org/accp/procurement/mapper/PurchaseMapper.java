package org.accp.procurement.mapper;

import java.util.List;
import org.accp.procurement.entity.Purchase;

public interface PurchaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Purchase record);

    Purchase selectByPrimaryKey(Integer id);

    List<Purchase> selectAll();

    int updateByPrimaryKey(Purchase record);
}