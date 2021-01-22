package org.accp.procurement.mapper;

import java.util.List;
import org.accp.procurement.entity.Supplierfiles;

public interface SupplierfilesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Supplierfiles record);

    Supplierfiles selectByPrimaryKey(Integer id);

    List<Supplierfiles> selectAll();

    int updateByPrimaryKey(Supplierfiles record);

    //根据报价表的供应商id查询供应商表 获取供应商id
    List<Supplierfiles> selectSuppByid(Integer id);
}