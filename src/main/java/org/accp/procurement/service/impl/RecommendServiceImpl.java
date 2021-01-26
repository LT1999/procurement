package org.accp.procurement.service.impl;


import org.accp.procurement.dto.RecommendDto;
import org.accp.procurement.entity.Recommend;
import org.accp.procurement.entity.Recommenddetail;
import org.accp.procurement.mapper.RecommendMapper;
import org.accp.procurement.service.RecommendService;
import org.accp.procurement.service.RecommenddetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Autowired
    private RecommenddetailService  recommenddetailService;

    /**
     * 根据产品编号查询推荐供应商表
     * @param productNo
     * @return 推荐供应商实体类
     * */
    @Override
    public Recommend selectByProductNo(String productNo) {
        return this.recommendMapper.selectByProductNo(productNo);
    }

    @Override
    public void InsertRecommend(RecommendDto recommendDto) {
        int id=this.recommendMapper.getId();
        recommendDto.getRecommend().setId(id);
        this.recommendMapper.insert(recommendDto.getRecommend());
        if (recommendDto.getRecommenddetails()!=null){
            for (int i=0;i<recommendDto.getRecommenddetails().size();i++){
                Recommenddetail recommenddetail=recommendDto.getRecommenddetails().get(i);
                recommenddetail.setParentId(id);
                this.recommenddetailService.InsertRecommenddetail(recommenddetail);
            }
        }
    }

    //  审核--未审核查询
    @Override
    public List<Recommend> selectAllByCheck() {
        return this.recommendMapper.selectAllByCheck();
    }

    @Override
    public int updateByPrimaryKey(Recommend record) {
        return this.recommendMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Recommend> selectAll() {
        return this.recommendMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey2(RecommendDto recommendDto) {
        int id=recommendDto.getRecommend().getId();
        this.recommendMapper.updateByPrimaryKey(recommendDto.getRecommend());
        if (recommendDto.getRecommenddetails()!=null){
            for (int i=0;i<recommendDto.getRecommenddetails().size();i++){
                this.recommenddetailService.deleteByParentId(id);
            }
            for (int j=0;j<recommendDto.getRecommenddetails().size();j++){
                Recommenddetail recommenddetail=recommendDto.getRecommenddetails().get(j);
                recommenddetail.setParentId(id);
                this.recommenddetailService.InsertRecommenddetail(recommenddetail);
            }

        }

        return 0;
    }
}