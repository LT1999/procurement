package org.accp.procurement.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class selsupDto {

    private Integer[] queryClassifyId;

    private String[] queryTime;

    public String type;//采购人编号

    private String Starttime;//查询开始时间

    private String Endtime;//查询结束时间

    private Integer firstKindId;//第一分类编号

    private Integer secondKindId;//第二分类编号

    private Integer threeKindId;//第三分类编号



}
