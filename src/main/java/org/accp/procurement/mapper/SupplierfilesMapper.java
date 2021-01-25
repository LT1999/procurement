package org.accp.procurement.mapper;

import java.util.List;

import org.accp.procurement.dto.selsupDto;
import org.accp.procurement.entity.Supplierfiles;

public interface SupplierfilesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Supplierfiles record);

    Supplierfiles selectByPrimaryKey(Integer id);

    List<Supplierfiles> selectAll();

    //查询未审核供应商
    List<Supplierfiles> selectCheck();

    int updateByPrimaryKey(Supplierfiles record);

    //根据报价表的供应商id查询供应商表 获取供应商id
    List<Supplierfiles> selectSuppByid(Integer id);

    //查询未审核供应商档案总数量
    int selectCount();

    //根据条件查询供应商档案
    List<Supplierfiles> selectChang(selsupDto dto);
    //根据报价表的供应商id查询供应商表 获取供应商id
    List<Supplierfiles> selectSuppByid(Integer id);

    List<Supplierfiles> findss(supplierDto dto);
    List<Supplierfiles> findss1(supplierDto dto);
    List<Supplierfiles> findss2(supplierDto dto);
    //查询已审核的供应商
    List<Supplierfiles> findCheck();
}