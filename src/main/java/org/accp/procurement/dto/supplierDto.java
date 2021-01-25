package org.accp.procurement.dto;

import lombok.Data;
import org.accp.procurement.entity.Linkman;
import org.accp.procurement.entity.Offer;
import org.accp.procurement.entity.Supplierfiles;

import java.util.Date;
import java.util.List;

@Data
public class supplierDto {

    private Supplierfiles supplierfiles;
    private Offer offer;
    private List<Offer> offers;
private Date time1;
private Date time2;
    private Linkman linkmen;
}
