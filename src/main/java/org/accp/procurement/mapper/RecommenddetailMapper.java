package org.accp.procurement.mapper;

import java.util.List;
import org.accp.procurement.entity.Recommenddetail;

public interface RecommenddetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Recommenddetail record);

    Recommenddetail selectByPrimaryKey(Integer id);

    List<Recommenddetail> selectAll();

    int updateByPrimaryKey(Recommenddetail record);
}