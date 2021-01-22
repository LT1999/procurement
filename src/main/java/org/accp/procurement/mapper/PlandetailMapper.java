package org.accp.procurement.mapper;

import java.util.List;
import org.accp.procurement.entity.Plandetail;
import org.apache.ibatis.annotations.Update;

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

    /**
     * 查询符合采购调度的数据
     * @return List<Plandetail>
     * */
    List<Plandetail> selectDispatch();
    /**
     * 修改调度标志
     * @param dispatch
     * @param PurchaseqplanId
     * @return int 返回成功状态
     * **/
    @Update("update Purchaseqplan set dispatch = #{dispatch} where id=#{PurchaseqplanId}")
    int updateDispatch(String dispatch,Integer PurchaseqplanId);
}