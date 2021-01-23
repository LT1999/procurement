package org.accp.procurement.service.impl;

import org.accp.procurement.dto.PurchaseDto;
import org.accp.procurement.entity.Purchase;
import org.accp.procurement.entity.Purchasedetail;
import org.accp.procurement.entity.Purchaseqplan;
import org.accp.procurement.entity.Serial;
import org.accp.procurement.mapper.PurchaseMapper;
import org.accp.procurement.mapper.PurchaseqplanMapper;
import org.accp.procurement.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * 采购总表服务接口实现
 *
 * @author LT
 * @since 2021-01-16 14:46:04
 * @description 
 */
@Service
public  class PurchaseServiceImpl implements PurchaseService {
    /**
     * 采购总表Mapper接口
     */
    @Autowired
    private PurchaseMapper purchaseMapper;
    @Autowired
    private PurchasedetailService purchasedetailService;
    @Autowired
    private SerialService serialService;
    @Autowired
    private PlandetailService plandetailService;
    @Override
    public int insert(PurchaseDto purchaseDto) {
        Integer count=0;

//        格式化日期
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String time=format.format(purchaseDto.getPurchase().getPurchaseRegistranttime());
//        获取下一个自增主键
        Integer id=this.purchaseMapper.getId();
//        创建编号生成实体类，设置参数
        Serial serial = new Serial();
        serial.setId(id);
        serial.setTime(time);
//        调用服务类方法生成编号
        String purchaseqNo= serialService.purchaseqNo(serial);
//        设置编号到采购总表类
        purchaseDto.getPurchase().setPurchaseqNo(purchaseqNo);
        purchaseDto.getPurchase().setCheckMark("未审核");
//        新增采购总表到数据库
        this.purchaseMapper.insert(purchaseDto.getPurchase());
//        遍历明细集合，设置父id参数，添加到数据库，状态累加
        for (Purchasedetail purchasedetail:
             purchaseDto.getPurchasedetailList()) {
            purchasedetail.setParentId(id);
           count += this.purchasedetailService.insert(purchasedetail);
        }
        count+=this.plandetailService.updateDispatch("已调度",purchaseDto.getPlanDetailId());
        return count;
    }

    @Override
    public List<Purchase> selectCheck() {
        return this.purchaseMapper.selectCheck();
    }

    @Override
    public Integer updateByPrimaryKey(Purchase purchase) {
        System.out.println(purchase.toString());
        return this.purchaseMapper.updateByPrimaryKey(purchase);
    }

    @Override
    public List<Purchase> selectAll() {
        return this.purchaseMapper.selectAll();
    }
}