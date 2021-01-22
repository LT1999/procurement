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

    private Offer[] offers;

    private Linkman linkmen;
    //登记人
    private String registrar;
    //登记时间
    private String registrartime;
    //供应商主键
    private int supplierId;
}
