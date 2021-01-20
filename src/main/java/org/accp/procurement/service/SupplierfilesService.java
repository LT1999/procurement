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
    //查询已审核的供应商
    List<Supplierfiles> findCheck();
}
