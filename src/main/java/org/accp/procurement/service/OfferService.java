package org.accp.procurement.service;


import org.accp.procurement.dto.supplierDto;
import org.accp.procurement.entity.Offer;

import java.util.List;

/**
 * 报价表服务接口
 *
 * @author LT
 * @since 2021-01-16 14:46:04
 * @description 
 */
public interface OfferService {
    //根据供应商ID查询
    List<Offer> findSupplierId(int supplierId);
    //查询全部
    List<Offer> selectAll();
    //根据供应商ID删除
    int delSupplierId(int supplierId);
    //新增
    int insert(supplierDto dto);
    List<Offer> findsp();
}
