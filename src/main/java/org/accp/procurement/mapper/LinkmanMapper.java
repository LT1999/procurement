package org.accp.procurement.mapper;

import java.util.List;
import org.accp.procurement.entity.Linkman;

public interface LinkmanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Linkman record);

    Linkman selectByPrimaryKey(Integer id);

    List<Linkman> selectAll();

    int updateByPrimaryKey(Linkman record);

    //根据供应商表的联系人id 查询联系人表获取联系人信息
    List<Linkman> selectLinbyid(Integer id);
}