package org.accp.procurement.mapper;

import java.util.List;

import org.accp.procurement.dto.PurchaseqplanDto;
import org.accp.procurement.entity.Purchaseqplan;
import org.apache.ibatis.annotations.Update;

public interface PurchaseqplanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Purchaseqplan record);
    /**
     * 根据id查询计划表
     * @param id
     * @return Purchaseqplan
     * */
    Purchaseqplan selectByPrimaryKey(Integer id);

    List<Purchaseqplan> selectAll();

    int updateByPrimaryKey(Purchaseqplan record);

    //未审核查询
    List<Purchaseqplan> selectAllbycheck();

    int getId();


}