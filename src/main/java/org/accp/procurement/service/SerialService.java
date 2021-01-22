package org.accp.procurement.service;


import org.accp.procurement.entity.Serial;

/**
 * <p>
 * 流水号
 * </p>
 *
 * @author dss
 * @since 2020-12-3
 */
public interface SerialService {

    /**
     * 供应商编号
     * @return String
     * @param serial
    **/
    String supplierNo(Serial serial);

    /**
     * 报价单编号，传入日期时间（yyyy-MM-dd）与id
     * @return String
     * @param serial
     **/
    String offerNo(Serial serial);

    /**
     * 采购计划编号，传入日期时间（yyyy-MM-dd）与id
     * @return String
     * @param serial
     **/
    String purchaseqPlanNo(Serial serial);

    /**
     * 采购编号，传入日期时间（yyyy-MM-dd）与id
     * @return String
     * @param serial
     **/
    String purchaseqNo (Serial serial);

}
