package org.accp.procurement.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 供应商档案表(supplierfiles)实体类
 *
 * @author LT
 * @since 2021-01-16 14:46:05
 * @description 
 */
@Data
public class Supplierfiles {

    /**
     * 供应商档案主键
     */
	private Integer id;
    /**
     * 供应商编号
     */
    private String supplierNo;
    /**
     * 供应商名称
     */
    private String supplierName;
    /**
     * 供应商地址
     */
    private String supplierAddress;
    /**
     * 产品Ⅰ级分类ID
     */
    private Integer firstKindId;
    /**
     * 产品Ⅰ级分类名称
     */
    private String firstKindName;
    /**
     * 产品Ⅱ级分类ID
     */
    private Integer secondKindId;
    /**
     * 产品Ⅱ级分类名称
     */
    private String secondKindName;
    /**
     * 产品Ⅲ级分类ID
     */
    private Integer threeKindId;
    /**
     * 产品Ⅲ级分类名称
     */
    private String threeKindName;
    /**
     * 所在区域
     */
    private String supplierArea;
    /**
     * 供应商曾用名
     */
    private String supplierUsedname;
    /**
     * 开户银行
     */
    private String supplierOpenAccount;
    /**
     * 银行账号
     */
    private String supplierBankaccount;
    /**
     * 网址
     */
    private String supplierUrl;
    /**
     * 优质级别
     */
    private String supplierQualityRank;
    /**
     * 电话
     */
    private String supplierPhone;
    /**
     * 传真
     */
    private String supplierFax;
    /**
     * 邮政编码
     */
    private String supplierPostalcode;
    /**
     * 第一联系人
     */
    private Integer supplierFirstcontact;
    /**
     * 第二联系人
     */
    private Integer supplierSecondcontact;
    /**
     * 登记人
     */
    private String supplierRegistrant;
    /**
     * 登记时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date supplierRegistrationtime;
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
     * 采购人
     */
    private String supplierBuyer;
    /**
     * 采购人编号
     */
    private String supplierBuyerNo;
    /**
     * 审核标志
     */
    private String checkMark;
}