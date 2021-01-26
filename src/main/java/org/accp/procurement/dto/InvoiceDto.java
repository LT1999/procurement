package org.accp.procurement.dto;

import lombok.Data;
import org.accp.procurement.entity.Purchase;
import org.accp.procurement.entity.Purchasedetail;

@Data
public class InvoiceDto {

    private Purchase purchase;

    private Purchasedetail purchasedetail;
}
