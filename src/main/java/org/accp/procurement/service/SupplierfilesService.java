package org.accp.procurement.service;


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
}
