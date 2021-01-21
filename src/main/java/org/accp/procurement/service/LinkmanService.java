package org.accp.procurement.service;


import org.accp.procurement.entity.Linkman;

/**
 * 联系人信息表服务接口
 *
 * @author LT
 * @since 2021-01-16 14:46:04
 * @description 
 */
public interface LinkmanService {
    //根据id查询
    Linkman selectByPrimaryKey(Integer id);
}
