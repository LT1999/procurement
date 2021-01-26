package org.accp.procurement.service;


import org.accp.procurement.entity.Recommenddetail;

import java.util.List;

/**
 * 推荐供应商明细服务接口
 *
 * @author LT
 * @since 2021-01-16 14:46:05
 * @description 
 */
public interface RecommenddetailService {
    /**
     * 根据产品编号查询推荐供应商明细表数据
     * @param productNo
     * @return List<Recommenddetail>（返回推荐供应商明细表数据集合）
     * */
    List<Recommenddetail> selectByProductNo(String productNo);

    void InsertRecommenddetail(Recommenddetail recommenddetail);

    List<Recommenddetail> selectByParentId(Integer parentId);

    //根据父id删除表的信息
    void deleteByParentId(Integer parentId);

    Integer delByOfferId(Integer oid);
}
