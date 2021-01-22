package org.accp.procurement.mapper;

import java.util.List;
import org.accp.procurement.entity.Recommenddetail;

public interface RecommenddetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Recommenddetail record);

    Recommenddetail selectByPrimaryKey(Integer id);

    List<Recommenddetail> selectAll();

    int updateByPrimaryKey(Recommenddetail record);
    /**
     * 根据父id(推荐供应商表id)查询推荐供应商明细表数据
     * @param parentId
     * @return List<Recommenddetail>（返回推荐供应商明细表数据集合）
     * */
    List<Recommenddetail> selectByParentId(Integer parentId);
}