package org.accp.procurement.mapper;

import java.util.List;

import org.accp.procurement.dto.supplierDto;
import org.accp.procurement.entity.Supplierfiles;

public interface SupplierfilesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Supplierfiles record);

    Supplierfiles selectByPrimaryKey(Integer id);

    List<Supplierfiles> selectAll();

    List<Supplierfiles> selectCheck();

    int updateByPrimaryKey(Supplierfiles record);
    //查询已审核的供应商
    List<Supplierfiles> findCheck();

    //根据报价表的供应商id查询供应商表 获取供应商id
    List<Supplierfiles> selectSuppByid(Integer id);

    List<Supplierfiles> findss(supplierDto dto);
    List<Supplierfiles> findss1(supplierDto dto);
    List<Supplierfiles> findss2(supplierDto dto);

}