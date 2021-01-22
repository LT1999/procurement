package org.accp.procurement.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
/**
 * 报价表(offer)实体类
 *
 * @author LT
 * @since 2021-01-16 14:46:04
 * @description 
 */
@Data
public class Offer {

    /**
     * 主键
     */
	private Integer id;
    /**
     * 报价单编号
     */
    private String offerNo;
    /**
     * 供应商主键
     */
    private Integer supplierId;
    /**
     * 商品编号
     */
    private String goodsNo;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 商品单价
     */
    private BigDecimal goodsPrice;
    /**
     * 商品折扣
     */
    private BigDecimal goodsDiscount;
    /**
     * 商品小计
     */
    private BigDecimal goodsSubtotal;
    /**
     * 商品描述
     */
    private String goodsDescribe;
    /**
     * 登记人
     */
    private String registrar;
    /**
     * 登记时间
     */
    private String registrartime;
    /**
     * 审核人
     */
    private String auditor;
    /**
     * 审核时间
     */
    private String auditorTime;
    /**
     * 审核标志
     */
    private String checkMark;

}