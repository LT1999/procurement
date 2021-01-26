package org.accp.procurement.service;


import org.accp.procurement.entity.Linkman;

import java.util.List;

/**
 * 联系人信息表服务接口
 *
 * @author LT
 * @since 2021-01-16 14:46:04
 * @description 
 */
public interface LinkmanService {
    int deleteByPrimaryKey(Integer id);

   /* int insert(Linkman record);*/

    Linkman selectByPrimaryKey(Integer id);

    List<Linkman> selectAll();

    int updateByPrimaryKey(Linkman record);

}
