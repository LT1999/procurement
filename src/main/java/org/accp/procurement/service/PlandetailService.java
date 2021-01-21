package org.accp.procurement.service;


import org.accp.procurement.entity.Plandetail;

import java.util.List;

/**
 * 采购计划明细表服务接口
 *
 * @author LT
 * @since 2021-01-16 14:46:04
 * @description 
 */
public interface PlandetailService {
    /**
     * 根据父id查询计划明细表
     * @param parentId
     * @return List<Plandetail>
     * */
    List<Plandetail> selectAllByParentId(Integer parentId);
    /**
     * 查询所有计划明细表并父id的类
     * @return List<Plandetail>
     * */
    /*List<Plandetail> selectAllAndPurchaseqplan();*/

}
