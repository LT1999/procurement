package org.accp.procurement.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 推荐供应商(recommend)实体类
 *
 * @author LT
 * @since 2021-01-16 14:46:05
 * @description 
 */
@Data
public class Recommend {

    /**
     * 编号
     */
	private Integer id;
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
     * 用途类型
     */
    private String productType;
    /**
     * 档次级别
     */
    private String productGrade;
    /**
     * 登记人
     */
    private String registrar;
    /**
     * 登记时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date registrartime;
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