package org.accp.procurement.entity;

import java.math.BigDecimal;
import lombok.Data;

/**
 * 采购计划明细表(plandetail)实体类
 *
 * @author LT
 * @since 2021-01-16 14:46:04
 * @description
 * @exends 继承采购计划表（Purchaseqplan）
 */
@Data
public class Plandetail{

    /**
     * 主键
     */
	private Integer id;
    /**
     * 父Id
     */
    private Integer parentId;
    /**
     * 产品编号
     */
    private String productNo;
    /**
     * 产品名称
     */
    private String productName;
    /**
     * 数量
     */
    private Integer quantity;
    /**
     * 单位
     */
    private String unit;
    /**
     * 单价
     */
    private BigDecimal price;
    /**
     * 小计
     */
    private BigDecimal subtotal;
    /**
     * 描述
     */
    private String describe;
    /**
     * 采购计划
     */
    private Purchaseqplan purchaseqplan;
}