package org.accp.procurement.mapper;
import org.accp.procurement.dto.supplierDto;
import java.util.List;
import org.accp.procurement.entity.Offer;

public interface OfferMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Offer record);

    Offer selectByPrimaryKey(Integer id);

    List<Offer> selectAll();

    int updateByPrimaryKey(Offer offer);
    //根据供应商ID查询
    List<Offer> findSupplierId(int supplierId);
    //根据供应商ID删除
    int delSupplierId(int supplierId);
    List<Offer> findsp();

    //根据产品id查询报价表的供应商
    List<Offer> selectAlloffer(String goodsNo);

    /**
     * 获取下一个自增主键
     * @return int
     * */
    int getId();
    //根据 审核标志查询
    List<Offer> findCheck(String checkMark);

    int countyi();
    int counter();
    int countsan();
    List<Offer> selectwei();
    int countwei();
    List<Offer> findtime(supplierDto dto);
}