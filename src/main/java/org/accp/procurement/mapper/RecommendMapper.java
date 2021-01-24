package org.accp.procurement.mapper;

import java.util.List;
import org.accp.procurement.entity.Recommend;

public interface RecommendMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Recommend record);

    Recommend selectByPrimaryKey(Integer id);

    List<Recommend> selectAll();

    int updateByPrimaryKey(Recommend record);
    /**
     * 根据产品编号查询推荐供应商表
     * @param productNo
     * @return 推荐供应商实体类
     * */
    Recommend selectByProductNo(String productNo);

    int getId();
}