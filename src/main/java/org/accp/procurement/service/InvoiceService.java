package org.accp.procurement.service;


import org.accp.procurement.dto.InvoiceDto;
import org.accp.procurement.entity.Invoice;

import java.util.List;

/**
 * 发票表服务接口
 *
 * @author LT
 * @since 2021-01-16 14:46:04
 * @description 
 */
public interface InvoiceService {
    List<InvoiceDto> selAllInvoice();

    int deleteByPrimaryKey(Integer id);

    int insert(Invoice record);

    Invoice selectByPrimaryKey(Integer id);

    List<Invoice> selectAll();

    int updateByPrimaryKey(Invoice record);

    List<Invoice> selectCheck();

    int selCheckcount();

    int ingCount();

    int overCount();

    int UnpaidCount();

    List<Invoice> selInvoiceBydto(InvoiceDto invoiceDto);

}
