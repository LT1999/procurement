package org.accp.procurement.dto;

import lombok.Data;
import org.accp.procurement.entity.Purchase;
import org.accp.procurement.entity.Purchasedetail;

@Data
public class InvoiceDto {

    private Purchase purchase;

    private Purchasedetail purchasedetail;

    private String[] queryTime;

    private String Starttime;//查询开始时间

    private String Endtime;//查询结束时间

    private String purchaseqNo;//执行单编号

    private String productName;//关键字

    private String type;//执行单状态
}
