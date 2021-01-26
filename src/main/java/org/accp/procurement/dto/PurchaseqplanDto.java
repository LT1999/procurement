package org.accp.procurement.dto;

import lombok.Data;
import org.accp.procurement.entity.Plandetail;
import org.accp.procurement.entity.Purchaseqplan;

import java.util.List;

@Data
public class PurchaseqplanDto {

    //采购计划表dto
    private Purchaseqplan purchaseqplan;

    private List<Plandetail> plandetails;
}
