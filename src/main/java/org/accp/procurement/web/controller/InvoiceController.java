package org.accp.procurement.web.controller;

import org.accp.procurement.dto.InvoiceDto;
import org.accp.procurement.entity.Invoice;
import org.accp.procurement.service.InvoiceService;
import org.accp.procurement.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 发票表服务控制器
 *
 * @author LT
 * @since 2021-01-16 14:46:04
 * @description 
 */

@RestController
@RequestMapping("/invoice")
@CrossOrigin(methods = {RequestMethod.POST,RequestMethod.GET})
public class InvoiceController {
    @Autowired
    private InvoiceService invoiceService;
    @Autowired
    private PurchaseService purchaseService;

    @RequestMapping("/selAllInvoice")
    public List<InvoiceDto> selAllInvoice(){
        return this.invoiceService.selAllInvoice();
    }
    @RequestMapping("/insert")
    public Integer insert(Invoice form){
        /*Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(simpleDateFormat.format(date));
        Serial serial=new Serial();
        serial.setId(this.supplierfilesService.getId());
        serial.setYi(ruleForm.getFirstKindId().toString());
        serial.setEr(ruleForm.getSecondKindId().toString());
        serial.setSan(ruleForm.getThreeKindId().toString());
        serial.setTime(simpleDateFormat.format(date));
        ruleForm.setSupplierNo(this.serialService.supplierNo(serial));
        return this.supplierfilesService.insert(ruleForm);*/

        this.purchaseService.updateSan(form.getId());
        return this.invoiceService.insert(form);
    }

    @RequestMapping("/selectCheck")
    public List<Invoice> selectCheck(){
        return this.invoiceService.selectCheck();
    }

    @RequestMapping("/updateByPrimaryKey")
    public Integer updateByPrimaryKey(Invoice form){
        return this.invoiceService.updateByPrimaryKey(form);
    }

    @RequestMapping("/selCheckcount")
    public int selCheckcount(){
        return this.invoiceService.selCheckcount();
    }

    @RequestMapping("/ingCount")
    public int ingCount(){
        return this.invoiceService.ingCount();
    }

    @RequestMapping("/overCount")
    public int overCount(){
        return this.invoiceService.overCount();
    }

    @RequestMapping("/UnpaidCount")
    public int UnpaidCount(){
        return this.invoiceService.UnpaidCount();
    }

    @RequestMapping("/selectAll")
    public List<Invoice> selectAll(){
        return this.invoiceService.selectAll();
    }

    @RequestMapping("/selInvoiceBydto")
    public List<Invoice> selInvoiceBydto(InvoiceDto searchFrom){
        InvoiceDto dto=new InvoiceDto();
        if (searchFrom!=null){
            if(searchFrom.getQueryTime()!=null&&searchFrom.getQueryTime().length!=0 ){
                dto.setStarttime(searchFrom.getQueryTime()[0]);
                dto.setEndtime(searchFrom.getQueryTime()[1]);
            }
            dto.setPurchaseqNo(searchFrom.getPurchaseqNo());
            dto.setProductName(searchFrom.getProductName());
            dto.setType(searchFrom.getType());
        }
        return this.invoiceService.selInvoiceBydto(dto);
    }

}