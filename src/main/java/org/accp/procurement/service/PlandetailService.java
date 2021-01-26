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
     * 查询所有计划明细表并查询父id的类
     * @return List<Plandetail>
     * */
    List<Plandetail> selectAllAndPurchaseqplan();

    /**
     * 修改调度标志
     * @param dispatch  调度字符串（已调度、未调度）
     * @param purchaseqplanId  修改条件的id
     * @return int 返回成功状态
     **/
    int updateDispatch(String dispatch,Integer purchaseqplanId);

    void  insertPlandetail(Plandetail plandetail);
}
