package org.accp.procurement.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 采购总表(purchase)实体类
 *
 * @author LT
 * @since 2021-01-16 14:46:04
 * @description 
 */
@Data
public class Purchase {

    /**
     * 主键
     */
	private Integer id;
    /**
     * 采购编号
     */
    private String purchaseqNo;
    /**
     * 产品主键
     */
    private String productId;
    /**
     * 产品编号
     */
    private String productNo;
    /**
     * 产品名称
     */
    private String productName;
    /**
     * 采购总数量
     */
    private Integer purchaseQuantity;
    /**
     * 合格总数量
     */
    private Integer qualifiedQuantity;
    /**
     * 采购总金额
     */
    private BigDecimal purchaseMoney;
    /**
     * 登记人
     */
    private String purchaseRegistrant;
    /**
     * 登记时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date purchaseRegistranttime;
    /**
     * 审核人
     */
    private String auditor;
    /**
     * 审核时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date auditorTime;

    /**
     * 审核标志
     */
    private String checkMark;


}