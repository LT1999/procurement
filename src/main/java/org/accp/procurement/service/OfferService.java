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

    //根据产品id查询报价表的供应商
    List<supplierDto> selectAlloffer(String goodsNo);
    /**
     * 获取下一个自增主键
     * @return int
     * */
    int getId();
    List<Offer> findCheck();
    //根据id修改
    int updateByPrimaryKey(Offer offer);

    int countyi();
    int counter();
    int countsan();
    List<Offer> selectwei();
    int countwei();
    int deleteByPrimaryKey(Integer id);
    List<Offer> findtime(supplierDto dto);
}
