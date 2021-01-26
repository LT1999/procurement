package org.accp.procurement.service.impl;


import org.accp.procurement.dto.PurchaseqplanDto;
import org.accp.procurement.entity.Plandetail;
import org.accp.procurement.entity.Purchaseqplan;
import org.accp.procurement.entity.Serial;
import org.accp.procurement.mapper.PlandetailMapper;
import org.accp.procurement.mapper.PurchaseMapper;
import org.accp.procurement.mapper.PurchaseqplanMapper;
import org.accp.procurement.service.PlandetailService;
import org.accp.procurement.service.PurchaseqplanService;
import org.accp.procurement.service.SerialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * 采购计划表服务接口实现
 *
 * @author LT
 * @since 2021-01-16 14:46:05
 * @description 
 */
@Service
public class PurchaseqplanServiceImpl implements PurchaseqplanService {
    /**
     * 采购计划表Mapper接口
     */
    @Autowired
    private PurchaseqplanMapper purchaseqplanMapper;
    @Autowired
    private PlandetailService plandetailService;
    @Autowired
    private SerialService serialService;
    /**
     * 采购计划明细表服务接口
     */

    @Override
    public Purchaseqplan selectByPrimaryKey(Integer id) {
        return this.purchaseqplanMapper.selectByPrimaryKey(id);
    }

    @Override
    public void insertPruchaseqplan(PurchaseqplanDto purchaseqplanDto) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String time=format.format(purchaseqplanDto.getPurchaseqplan().getPurchaseqRegistranttime());

        int id=this.purchaseqplanMapper.getId();

        Serial serial = new Serial();
        serial.setId(id);
        serial.setTime(time);

        String no=this.serialService.purchaseqPlanNo(serial);
        purchaseqplanDto.getPurchaseqplan().setPurchaseqNo(no);
        purchaseqplanDto.getPurchaseqplan().setId(id);
        this.purchaseqplanMapper.insert(purchaseqplanDto.getPurchaseqplan());
        if (purchaseqplanDto.getPlandetails()!=null){
            for (int i=0;i<purchaseqplanDto.getPlandetails().size();i++){
                Plandetail plandetail=purchaseqplanDto.getPlandetails().get(i);
                plandetail.setParentId(id);
                this.plandetailService.insertPlandetail(plandetail);
            }
        }

    }

    @Override
    public List<Purchaseqplan> selectAllbycheck() {
        return this.purchaseqplanMapper.selectAllbycheck();
    }

    //修改审核状态为已审核
    @Override
    public int updateByPrimaryKey(Purchaseqplan record) {
        return this.purchaseqplanMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Purchaseqplan> selectAll() {
        return this.purchaseqplanMapper.selectAll();
    }


}