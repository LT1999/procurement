package org.accp.procurement.service.impl;



import org.accp.procurement.dto.supplierDto;
import org.accp.procurement.entity.Linkman;
import org.accp.procurement.entity.Offer;
import org.accp.procurement.entity.Serial;
import org.accp.procurement.entity.Supplierfiles;
import org.accp.procurement.mapper.LinkmanMapper;
import org.accp.procurement.mapper.OfferMapper;
import org.accp.procurement.mapper.SupplierfilesMapper;
import org.accp.procurement.service.OfferService;
import org.accp.procurement.service.SerialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * 报价表服务接口实现
 *
 * @author LT
 * @since 2021-01-16 14:46:04
 * @description
 */

@Service
public class OfferServiceImpl implements OfferService {
    @Autowired
    private OfferMapper offerMapper;
    @Autowired
    private SerialService serialService;
    @Autowired
    private SupplierfilesMapper supplierfilesMapper;

    @Autowired
    private LinkmanMapper linkmanMapper;
    @Override
    public List<Offer> findSupplierId(int supplierId) {
        return this.offerMapper.findSupplierId(supplierId);
    }

    @Override
    public List<Offer> selectAll() {
        return this.offerMapper.selectAll();
    }

    @Override
    public int delSupplierId(int supplierId) {
        return this.offerMapper.delSupplierId(supplierId);
    }

    @Override
    public int insert(supplierDto dto) {
        int num=0;
//        格式化日期
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String time="";
//        获取下一个自增主键
        Integer id=this.offerMapper.getId();
//        创建编号生成实体类，设置参数
        Serial serial = new Serial();
//        调用服务类方法生成编号
        String oNo= "";
        if(dto.getOffers()!=null&&dto.getOffers().size()!=0) {
            for (int i = 0; i < dto.getOffers().size(); i++) {
                time=format.format(dto.getOffers().get(i).getRegistrartime());
                serial.setId(id);
                serial.setTime(time);
                oNo=serialService.offerNo(serial);
                dto.getOffers().get(i).setId(this.offerMapper.getId());
                dto.getOffers().get(i).setOfferNo(oNo);
                num+=this.offerMapper.insert(dto.getOffers().get(i));
            }
        }
        return 1;
    }

    @Override
    public List<Offer> findsp() {
        return this.offerMapper.findsp();
    }

    @Override
    public List<supplierDto> selectAlloffer(String goodsNo) {
        //supplierDto dto=new supplierDto();
        List<supplierDto> dtoList=new ArrayList<supplierDto>();
        List<Offer> list=this.offerMapper.selectAlloffer(goodsNo);
        for (int i=0;i<list.size();i++){
            supplierDto dto=new supplierDto();
            dto.setOffer(list.get(i));
            List<Supplierfiles> list1=this.supplierfilesMapper.selectSuppByid(list.get(i).getSupplierId());
            for (int f=0;f<list1.size();f++){
                dto.setSupplierfiles(list1.get(f));

            }
            dtoList.add(dto);
        }
        return dtoList;
    }

    @Override
    public int getId() {
        return this.offerMapper.getId();
    }

    @Override
    public List<Offer> findCheck() {
        return this.offerMapper.findCheck("未审核");
    }

    @Override
    public int updateByPrimaryKey(Offer offer) {
        return this.offerMapper.updateByPrimaryKey(offer);
    }

    @Override
    public int countyi() {
        return this.offerMapper.countyi();
    }

    @Override
    public int counter() {
        return this.offerMapper.counter();
    }

    @Override
    public int countsan() {
        return this.offerMapper.countsan();
    }

    @Override
    public List<Offer> selectwei() {
        return this.offerMapper.selectwei();
    }

    @Override
    public int countwei() {
        return this.offerMapper.countwei();
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.offerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Offer> findtime(supplierDto dto) {
        return this.offerMapper.findtime(dto);
    }
}