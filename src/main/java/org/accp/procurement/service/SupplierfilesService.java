package org.accp.procurement.service;


import org.accp.procurement.dto.selsupDto;
import org.accp.procurement.entity.Supplierfiles;

import java.util.List;

/**
 * 供应商档案表服务接口
 *
 * @author LT
 * @since 2021-01-16 14:46:05
 * @description 
 */
public interface SupplierfilesService {
     int deleteByPrimaryKey(Integer id);

     int insert(Supplierfiles record);

     Supplierfiles selectByPrimaryKey(Integer id);

     List<Supplierfiles> selectAll();

     List<Supplierfiles> selectCheck();

     int updateByPrimaryKey(Supplierfiles record);

     //查询未审核供应商档案总数量
     int selectCount();

     //根据条件查询供应商档案
     List<Supplierfiles> selectChang(selsupDto dto);
}
