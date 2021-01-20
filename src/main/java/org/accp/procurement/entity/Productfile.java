package org.accp.procurement.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class Productfile {

    /**
     * 产品档案表id
     */
    private Integer id;

    /**
     * 产品编号
     */
    private String productId;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 制造商
     */
    private String factoryName;

    /**
     * 产品I级分类ID
     */
    private String firstKindId;

    /**
     * 产品I级分类名称
     */
    private String firstKindName;

    /**
     * 产品II级分类ID
     */
    private String secondKindId;

    /**
     * 产品II级分类名称
     */
    private String secondKindName;

    /**
     * 产品III级分类ID
     */
    private String thirdKindId;

    /**
     * 产品III级分类名称
     */
    private String thirdKindName;

    /**
     * 产品简称
     */
    private String productNick;

    /**
     * 用途类型 商品、物料
     */
    private String type;

    /**
     * 档次级别 高档、中档、低档
     */
    private String productClass;

    /**
     * 计量单位
     */
    private String personalUnit;

    /**
     * 计量值
     */
    private String personalValue;

    /**
     * 供应商集合
     */
    private String providerGroup;

    /**
     * 保修期
     */
    private String warranty;

    /**
     * 替代品名称
     */
    private String twinName;

    /**
     * 替代品编号
     */
    private String twinId;

    /**
     * 生命周期
     */
    private String lifecycle;

    /**
     * 市场单价
     */
    private Double listPrice;

    /**
     * 计划成本单价
     */
    private Double costPrice;

    /**
     * 成本单价
     */
    private Double realCostPrice;

    /**
     * 单位
     */
    private String amountUnit;

    /**
     * 产品描述
     */
    private String productDescribe;

    /**
     * 产品经理
     */
    private String responsiblePerson;

    /**
     * 登记人
     */
    private String register;

    /**
     * 建档时间
     */
    private String registerTime;

    /**
     * 复核人
     */
    private String checker;

    /**
     * 复核时间
     */
    private String checkTime;

    /**
     * 审核标志：等待审核、审核通过、审核不通过
     */
    private String checkTag;

    /**
     * 变更人
     */
    private String changer;

    /**
     * 变更时间
     */
    private String changeTime;

    /**
     * 档案变更标志: 未变更、已变更
     */
    private String changeTag;

    /**
     * 价格变更标志: 未变更 已变更
     */
    private String priceChangeTag;

    /**
     * 档案变更累计
     */
    private Integer fileChangeAmount;

    /**
     * 产品删除标志: 未删除 已删除
     */
    private String deleteTag;

    
    /**
     * 产品删除时间
     */
    private String deleteTime;
    
    /**
     * 物料组成标志: 未设计  已设计
     */
    private String designModuleTag;

    /**
     * 工序组成标志: 未设计  已设计
     */
    private String designProcedureTag;

    /**
     * 库存分配标志: 未设计  已设计
     */
    private String designCellTag;


}
