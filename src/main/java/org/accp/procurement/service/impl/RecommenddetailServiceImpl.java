package org.accp.procurement.service.impl;

import org.accp.procurement.entity.Recommend;
import org.accp.procurement.entity.Recommenddetail;
import org.accp.procurement.mapper.RecommenddetailMapper;
import org.accp.procurement.service.RecommendService;
import org.accp.procurement.service.RecommenddetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 推荐供应商明细服务接口实现
 *
 * @author LT
 * @since 2021-01-16 14:46:05
 * @description 
 */
@Service
public class RecommenddetailServiceImpl implements RecommenddetailService {
    @Autowired
    private RecommenddetailMapper recommenddetailMapper;
    /**供应商推荐表服务类（RecommendService）**/
    @Autowired
    private RecommendService recommendService;

    /**
     * 根据产品编号查询推荐供应商明细表数据
     * @param productNo
     * @return List<Recommenddetail>（返回推荐供应商明细表数据集合）
     * */
    @Override
    public List<Recommenddetail> selectByProductNo(String productNo) {
        Recommend recommend=this.recommendService.selectByProductNo(productNo);
        return this.recommenddetailMapper.selectByParentId(recommend.getId());
    }
}