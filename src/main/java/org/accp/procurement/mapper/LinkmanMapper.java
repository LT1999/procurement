package org.accp.procurement.mapper;

import java.util.List;
import org.accp.procurement.entity.Linkman;

public interface LinkmanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Linkman record);

    Linkman selectByPrimaryKey(Integer id);

    List<Linkman> selectAll();

    int updateByPrimaryKey(Linkman record);
}