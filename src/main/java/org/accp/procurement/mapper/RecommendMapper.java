package org.accp.procurement.mapper;

import java.util.List;
import org.accp.procurement.entity.Recommend;

public interface RecommendMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Recommend record);

    Recommend selectByPrimaryKey(Integer id);

    List<Recommend> selectAll();

    int updateByPrimaryKey(Recommend record);
}