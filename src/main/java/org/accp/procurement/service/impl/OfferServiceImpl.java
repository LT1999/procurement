package org.accp.procurement.service.impl;



import org.accp.procurement.dto.supplierDto;
import org.accp.procurement.entity.Linkman;
import org.accp.procurement.entity.Offer;
import org.accp.procurement.entity.Supplierfiles;
import org.accp.procurement.mapper.LinkmanMapper;
import org.accp.procurement.mapper.OfferMapper;
import org.accp.procurement.mapper.SupplierfilesMapper;
import org.accp.procurement.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    private SupplierfilesMapper supplierfilesMapper;

    @Autowired
    private LinkmanMapper linkmanMapper;

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
                  List<Linkman> list2=this.linkmanMapper.selectLinbyid(list1.get(f).getSupplierFirstcontact());
                  for (int h=0;h<list2.size();h++){
                      dto.setLinkmen(list2.get(h));

                  }

              }
            dtoList.add(dto);
        }
        return dtoList;
    }
}