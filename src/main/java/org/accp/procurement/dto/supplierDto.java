package org.accp.procurement.dto;

import lombok.Data;
import org.accp.procurement.entity.Linkman;
import org.accp.procurement.entity.Offer;
import org.accp.procurement.entity.Supplierfiles;

import java.util.List;

@Data
public class supplierDto {
    private Integer goodsno;

    private Supplierfiles supplierfiles;

    private Offer ofers;

    private Linkman linkmen;
}
