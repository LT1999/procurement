package org.accp.procurement.service;


import org.accp.procurement.dto.RecommendDto;
import org.accp.procurement.entity.Recommend;

import java.util.List;

/**
 * 推荐供应商服务接口
 *
 * @author LT
 * @since 2021-01-16 14:46:05
 * @description 
 */
public interface RecommendService {
    /**
     * 根据产品编号查询推荐供应商表
     * @param productNo
     * @return 推荐供应商实体类
     * */
    Recommend selectByProductNo(String productNo);

    void  InsertRecommend(RecommendDto recommendDto);

    //供应商推荐审核
    List<Recommend> selectAllByCheck();

    //审核通过修改
    int updateByPrimaryKey(Recommend record);

    //供应商推荐查询
    List<Recommend> selectAll();

    //变更修改审核状态
    int updateByPrimaryKey2(RecommendDto recommendDto);
}
