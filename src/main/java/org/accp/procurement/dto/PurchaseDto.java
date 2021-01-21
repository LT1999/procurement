package org.accp.procurement.dto;

import lombok.Data;
import org.accp.procurement.entity.Purchase;
import org.accp.procurement.entity.Purchasedetail;

import java.util.List;

/**
 * @author LT
 * @Classname PurchaseDto
 * @Description TODO
 * @date 2021/1/21 16:32
 * @Created by LT
 **/
@Data
public class PurchaseDto {
    private Purchase purchase;
    private List<Purchasedetail> purchasedetailList;
}
