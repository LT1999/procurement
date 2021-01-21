package org.accp.procurement.mapper;

import java.util.List;
import org.accp.procurement.entity.Offer;

public interface OfferMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Offer record);

    Offer selectByPrimaryKey(Integer id);

    List<Offer> selectAll();

    int updateByPrimaryKey(Offer record);
    //根据供应商ID查询
    List<Offer> findSupplierId(int supplierId);
    //根据供应商ID删除
    int delSupplierId(int supplierId);
}