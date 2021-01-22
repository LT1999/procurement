package org.accp.procurement.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 采购计划表(purchaseqplan)实体类
 *
 * @author LT
 * @since 2021-01-16 14:46:05
 * @description 
 */
@Data
public class Purchaseqplan {

    /**
     * 主键
     */
	private Integer id;
    /**
     * 采购编号
     */
    private String purchaseqNo;
    /**
     * 采购总价
     */
    private BigDecimal purchaseqTotalprices;
    /**
     * 采购总数量
     */
    private String purchaseqTotalquantity;
    /**
     * 采购理由
     */
    private String purchaseqReason;
    /**
     * 供货时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date purchaseqSupplytime;
    /**
     * 登记人
     */
    private String purchaseqRegistrant;
    /**
     * 登记时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date purchaseqRegistranttime;
    /**
     * 备注
     */
    private String purchaseqRemark;
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