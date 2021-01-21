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

	public String getYi() {
		return yi;
	}

	public void setYi(String yi) {
		this.yi = yi;
	}

	public String getEr() {
		return er;
	}

	public void setEr(String er) {
		this.er = er;
	}

	public String getSan() {
		return san;
	}

	public void setSan(String san) {
		this.san = san;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Serial [yi=" + yi + ", er=" + er + ", san=" + san + ", time=" + time + "]";
	}

}
