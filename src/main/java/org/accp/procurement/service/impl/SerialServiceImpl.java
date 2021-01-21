package org.accp.procurement.service.impl;


import org.accp.procurement.entity.Serial;
import org.accp.procurement.service.SerialService;
import org.springframework.stereotype.Service;

/**
 * @author LT
 */
@Service
public class SerialServiceImpl implements SerialService {


	/**
	 * 供应商编号
	 * @return String
	 * @param serial
	 **/
	@Override
	public String supplierNo(Serial serial) {
		String num="110";
		int id=serial.getId();
		int ids;
		int gap;
		String[] time=serial.getTime().split("-");
		if("1".equals(time[1]) && "1".equals(time[2])) {
            gap=id-1;
            ids=id-gap;
			if(ids>=10 && ids<100) {
				num+=serial.getYi()+serial.getEr()+serial.getSan()+"0000"+ids;
			}else if(ids>=100 && ids<1000) {
				num+=serial.getYi()+serial.getEr()+serial.getSan()+"000"+ids;
			}else if(ids>=1000 && ids<10000) {
				num+=serial.getYi()+serial.getEr()+serial.getSan()+"00"+ids;
			}else if(ids>=10000 && ids<100000) {
				num+=serial.getYi()+serial.getEr()+serial.getSan()+"0"+ids;
			}else if(ids<10){
				num+=serial.getYi()+serial.getEr()+serial.getSan()+"00000"+ids;
			}
		}else {
			if(id>=10 && id<100) {
				num+=serial.getYi()+serial.getEr()+serial.getSan()+"0000"+id;
			}else if(id>=100 && id<1000) {
				num+=serial.getYi()+serial.getEr()+serial.getSan()+"000"+id;
			}else if(id>=1000 && id<10000) {
				num+=serial.getYi()+serial.getEr()+serial.getSan()+"00"+id;
			}else if(id>=10000 && id<100000) {
				num+=serial.getYi()+serial.getEr()+serial.getSan()+"0"+id;
			}else {
				num+=serial.getYi()+serial.getEr()+serial.getSan()+"00000"+id;
			}
		}
		return num;
	}

	/**
	 * 报价单编号，传入日期时间（yyyy-MM-dd）与id
	 * @return String
	 * @param serial
	 **/
	@Override
	public String offerNo(Serial serial) {
		String num="210";
		int id=serial.getId();
		return getNo(serial, num, id);
	}

	/**
	 * 采购计划编号，传入日期时间（yyyy-MM-dd）与id
	 * @return String
	 * @param serial
	 **/
	@Override
	public String purchaseqPlanNo(Serial serial) {
		String num="211";
		int id=serial.getId();
		return getNo(serial, num, id);
	}

	/**
	 * 采购编号，传入日期时间（yyyy-MM-dd）与id
	 * @return String
	 * @param serial
	 **/
	@Override
	public String purchaseqNo(Serial serial) {
		String num="310";
		int id=serial.getId();
		return getNo(serial, num, id);
	}

	private String getNo(Serial serial, String num, int id) {
		int ids;
		int gap;
		String[] time=serial.getTime().split("-");
		String times=time[0];
		if(time[1].length()==1) {
			times+="0"+time[1];
		}else {
			times+=time[1];
		}
		if(time[2].length()==1) {
			times+="0"+time[2];
		}else {
			times+=time[2];
		}
		if("1".equals(time[1]) && "1".equals(time[2])) {
			gap=id-1;
			ids=id-gap;
			if(ids>=10 && ids<100) {
				num+=times+"00"+ids;
			}else if(ids>=100 && ids<1000) {
				num+=times+"0"+ids;
			}else if(ids<10){
				num+=times+"000"+ids;
			}
		}else {
			if(id>=10 && id<100) {
				num+=times+"00"+id;
			}else if(id>=100 && id<1000) {
				num+=times+"0"+id;
			}else {
				num+=times+"000"+id;
			}
		}
		return num;
	}

}
