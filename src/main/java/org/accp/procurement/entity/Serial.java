package org.accp.procurement.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 流水号表
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Serial implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;// 产品id
	private String yi;// 一级分类编号
	private String er;// 二级分类编号
	private String san;// 三级分类编号
	private String time;// 当前日期

}
