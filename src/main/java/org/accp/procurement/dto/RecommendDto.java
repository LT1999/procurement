package org.accp.procurement.dto;

import lombok.Data;
import org.accp.procurement.entity.Recommend;
import org.accp.procurement.entity.Recommenddetail;

import java.util.List;

@Data
public class RecommendDto {
    //推荐供应商表Dto
    private Recommend recommend;
    private List<Recommenddetail> recommenddetails;
}
