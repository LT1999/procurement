package org.accp.procurement.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 发票表(invoice)实体类
 *
 * @author LT
 * @since 2021-01-16 14:46:04
 * @description 
 */
@Data
public class Invoice {

    /**
     * 主键
     */
	private Integer id;
    /**
     * 采购编号
     */
    private String purchaseqNo;
    /**
     * 产品编号
     */
    private String productNo;
    /**
     * 产品名称
     */
    private String productName;
    /**
     * 供应商编号
     */
    private String supplierNo;
    /**
     * 供应商名称
     */
    private String supplierName;
    /**
     * 应开票金额
     */
    private BigDecimal shouldinvoicemoney;
    /**
     * 已开票金额
     */
    private BigDecimal invoicemoney;
    /**
     * 登记人
     */
    private String registrant;
    /**
     * 登记时间
     */
    private Date registranttime;

}