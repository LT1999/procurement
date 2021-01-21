package org.accp.procurement.service.impl;


import org.accp.procurement.entity.Serial;
import org.accp.procurement.service.SerialService;
import org.springframework.stereotype.Service;

@Service
public class SerialServiceImpl implements SerialService {

	
	//产品编号
	@Override
	public String productId(Serial serial) {
		String num="100";
		int id=serial.getId();
		int ids=0;
		int gap=0;
		int pd=0;
		String[] time=serial.getTime().split("-");
		System.out.println("------------------time---"+time);
		if(time[1].equals("1") && time[2].equals("1")) {
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
		System.out.println("------------------------num=----------"+num);
		return num;
	}

	
	//物料设计单编号
	@Override
	public String moduleId(Serial serial) {
		String num="200";
		int id=serial.getId();
		int ids=0;
		int gap=0;
		int pd=0;
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
		System.out.println("------------------time---"+time);
		if(time[1].equals("1") && time[2].equals("1")) {
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
		System.out.println("------------------------num=----------"+num);
		return num;
	}


	//工序设计单编号
	@Override
	public String gxId(Serial serial) {
		String num="201";
		int id=serial.getId();
		int ids=0;
		int gap=0;
		int pd=0;
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
		System.out.println("------------------time---"+time);
		if(time[1].equals("1") && time[2].equals("1")) {
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
		System.out.println("------------------------num=----------"+num);
		return num;
	}


	@Override
	public String scjhId(Serial serial) {
		String num="300";
		int id=serial.getId();
		int ids=0;
		int gap=0;
		int pd=0;
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
		System.out.println("------------------time---"+time);
		if(time[1].equals("1") && time[2].equals("1")) {
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
		System.out.println("------------------------num=----------"+num);
		return num;
	}


	@Override
	public String scId(Serial serial) {
		String num="301";
		int id=serial.getId();
		int ids=0;
		int gap=0;
		int pd=0;
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
		System.out.println("------------------time---"+time);
		if(time[1].equals("1") && time[2].equals("1")) {
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
		System.out.println("------------------------num=----------"+num);
		return num;
	}


	@Override
	public String kcId(Serial serial) {
		String num="400";
		int id=serial.getId();
		int ids=0;
		int gap=0;
		int pd=0;
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
		System.out.println("------------------time---"+time);
		if(time[1].equals("1") && time[2].equals("1")) {
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
		System.out.println("------------------------num=----------"+num);
		return num;
	}


	@Override
	public String rkId(Serial serial) {
		String num="401";
		int id=serial.getId();
		int ids=0;
		int gap=0;
		int pd=0;
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
		System.out.println("------------------time---"+time);
		if(time[1].equals("1") && time[2].equals("1")) {
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
		System.out.println("------------------------num=----------"+num);
		return num;
	}


	@Override
	public String ckId(Serial serial) {
		String num="402";
		int id=serial.getId();
		int ids=0;
		int gap=0;
		int pd=0;
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
		System.out.println("------------------time---"+time);
		if(time[1].equals("1") && time[2].equals("1")) {
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
		System.out.println("------------------------num=----------"+num);
		return num;
	}

}
