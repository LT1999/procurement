package org.accp.procurement.entity;


import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
/**
 * 采购明细表(purchasedetail)实体类
 *
 * @author LT
 * @since 2021-01-16 14:46:05
 * @description 
 */
@Data
public class Purchasedetail {

    /**
     * 主键
     */
	private Integer id;
    /**
     * 父ID
     */
    private Integer parentId;
    /**
     * 供应商编号
     */
    private String supplierNo;
    /**
     * 供应商名称
     */
    private String supplierName;
    /**
     * 采购数量
     */
    private Integer quantity;
    /**
     * 合格数量
     */
    private Integer qualifiedQuantity;
    /**
     * 单价
     */
    private BigDecimal price;
    /**
     * 小计
     */
    private BigDecimal subtotal;
    /**
     * 付款时间
     */
    private Date paymenttime;

}