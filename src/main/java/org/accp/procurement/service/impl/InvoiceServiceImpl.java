package org.accp.procurement.service.impl;


import org.accp.procurement.dto.InvoiceDto;
import org.accp.procurement.entity.Purchase;
import org.accp.procurement.entity.Purchasedetail;
import org.accp.procurement.mapper.InvoiceMapper;
import org.accp.procurement.mapper.PurchaseMapper;
import org.accp.procurement.mapper.PurchasedetailMapper;
import org.accp.procurement.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 发票表服务接口实现
 *
 * @author LT
 * @since 2021-01-16 14:46:04
 * @description 
 */
@Service
public class InvoiceServiceImpl implements InvoiceService {
    @Autowired
    private InvoiceMapper invoiceMapper;
    @Autowired
    private PurchaseMapper purchaseMapper;
    @Autowired
    private PurchasedetailMapper purchasedetailMapper;

    @Override
    public List<InvoiceDto> selAllInvoice() {
        List<InvoiceDto> dtolist=new ArrayList();
        List<Purchase> purchaseslist=this.purchaseMapper.selPurchase();
        for (int i = 0; i < purchaseslist.size(); i++) {
            InvoiceDto invoiceDto=new InvoiceDto();
            invoiceDto.setPurchase(purchaseslist.get(i));
            List<Purchasedetail> purchasedetaillist=this.purchasedetailMapper.selectByParentId(purchaseslist.get(i).getId());
            for (int j = 0; j <purchasedetaillist.size() ; j++) {
                invoiceDto.setPurchasedetail(purchasedetaillist.get(j));
            }
            dtolist.add(invoiceDto);
        }
        return dtolist;

    }
}