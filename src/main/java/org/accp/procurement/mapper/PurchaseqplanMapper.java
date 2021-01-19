package org.accp.procurement.mapper;

import java.util.List;
import org.accp.procurement.entity.Purchaseqplan;

public interface PurchaseqplanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Purchaseqplan record);

    Purchaseqplan selectByPrimaryKey(Integer id);

    List<Purchaseqplan> selectAll();

    int updateByPrimaryKey(Purchaseqplan record);
}