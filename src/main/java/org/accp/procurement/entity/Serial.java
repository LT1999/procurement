package org.accp.procurement.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 流水号表
 * @author LT
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Serial implements Serializable {

	private static final long serialVersionUID = 1L;
	/** 产品id */
	private int id;
	/** 一级分类编号 */
	private String yi;
	/** 二级分类编号 */
	private String er;
	/** 三级分类编号 */
	private String san;
	/** 当前日期 */
	private String time;

}
