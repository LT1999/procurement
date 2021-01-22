package org.accp.procurement.service.impl;


import org.accp.procurement.entity.Recommend;
import org.accp.procurement.mapper.RecommendMapper;
import org.accp.procurement.service.RecommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 推荐供应商服务接口实现
 *
 * @author LT
 * @since 2021-01-16 14:46:05
 * @description 
 */
@Service
public class RecommendServiceImpl implements RecommendService {

    @Autowired
    private RecommendMapper recommendMapper;

    /**
     * 根据产品编号查询推荐供应商表
     * @param productNo
     * @return 推荐供应商实体类
     * */
    @Override
    public Recommend selectByProductNo(String productNo) {
        return this.recommendMapper.selectByProductNo(productNo);
    }
}