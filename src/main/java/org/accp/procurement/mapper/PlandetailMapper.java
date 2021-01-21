package org.accp.procurement.mapper;

import java.util.List;
import org.accp.procurement.entity.Plandetail;

public interface PlandetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Plandetail record);

    Plandetail selectByPrimaryKey(Integer id);

    List<Plandetail> selectAll();

    int updateByPrimaryKey(Plandetail record);

    /**
     * 根据父id查询计划明细表
     * @param parentId
     * @return List<Plandetail>
     * */
    List<Plandetail> selectAllByParentId(Integer parentId);
}