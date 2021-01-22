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

    //根据产品id查询报价表的供应商
    List<supplierDto> selectAlloffer(String goodsNo);

}
