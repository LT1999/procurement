package org.accp.procurement.entity;


import lombok.Data;

/**
 * 联系人信息表(linkman)实体类
 *
 * @author LT
 * @since 2021-01-16 14:46:04
 * @description 
 */
@Data
public class Linkman {

    /**
     * 主键
     */
	private Integer id;
    /**
     * 联系人姓名
     */
    private String linkmanName;
    /**
     * 部门
     */
    private String linkmanSector;
    /**
     * 职务
     */
    private String linkmanPost;
    /**
     * 手机号码
     */
        private String linkmanPhone;
    /**
     * 邮箱
     */
    private String linkmanEmail;
    /**
     * 性别
     */
    private String linkmanSex;

}