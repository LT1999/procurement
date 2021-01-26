package org.accp.procurement.service;


import org.accp.procurement.dto.InvoiceDto;

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

}
