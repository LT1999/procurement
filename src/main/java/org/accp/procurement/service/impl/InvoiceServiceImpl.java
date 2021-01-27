package org.accp.procurement.service.impl;


import org.accp.procurement.dto.InvoiceDto;
import org.accp.procurement.entity.Invoice;
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

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Invoice record) {
        return this.invoiceMapper.insert(record);
    }

    @Override
    public Invoice selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<Invoice> selectAll() {
        return this.invoiceMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Invoice record) {
        return this.invoiceMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Invoice> selectCheck() {
        return this.invoiceMapper.selectCheck();
    }

    @Override
    public int selCheckcount() {
        return this.invoiceMapper.selCheckcount();
    }

    @Override
    public int ingCount() {
        return this.invoiceMapper.ingCount();
    }

    @Override
    public int overCount() {
        return this.invoiceMapper.overCount();
    }

    @Override
    public int UnpaidCount() {
        return this.invoiceMapper.UnpaidCount();
    }

    @Override
    public List<Invoice> selInvoiceBydto(InvoiceDto invoiceDto) {
        return this.invoiceMapper.selInvoiceBydto(invoiceDto);
    }
}