package org.accp.procurement.entity;

import lombok.Data;

/**
 * 推荐供应商明细(recommenddetail)实体类
 *
 * @author LT
 * @since 2021-01-16 14:46:05
 * @description 
 */
@Data
public class Recommenddetail {

    /**
     * 主键
     */
	private Integer id;
    /**
     * 父id
     */
    private Integer parentId;
    /**
     * 供应商主键
     */
    private String supplierId;
    /**
     * 供应商编号
     */
    private String supplierNo;
    /**
     * 供应商名称
     */
    private String supplierName;
    /**
     * 供应商所在区域
     */
    private String supplierArea;
    /**
     * 优质级别
     */
    private String supplierQualityRank;
    /**
     * 电话
     */
    private String supplierPhone;
    /**
     * 联系人主键
     */
    private Integer linkmanId;
    /**
     * 此产品报价单主键
     */
    private Integer offerId;

}