package org.accp.procurement.service.impl;

import org.accp.procurement.dto.selsupDto;
import org.accp.procurement.entity.Supplierfiles;
import org.accp.procurement.mapper.SupplierfilesMapper;
import org.accp.procurement.service.SupplierfilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 供应商档案表服务接口实现
 *
 * @author LT
 * @since 2021-01-16 14:46:05
 * @description
 */
@Service
public class SupplierfilesServiceImpl implements SupplierfilesService {
    @Autowired
    private SupplierfilesMapper supplierfilesMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Supplierfiles record) {
        System.out.println("-----------------------------------------");
        System.out.println(record.toString());
        return this.supplierfilesMapper.insert(record);
    }

    @Override
    public Supplierfiles selectByPrimaryKey(Integer id) {
        return this.supplierfilesMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Supplierfiles> selectAll() {
        return this.supplierfilesMapper.selectAll();
    }

    @Override
    public List<Supplierfiles> selectCheck() {
        return this.supplierfilesMapper.selectCheck();
    }

    @Override
    public int updateByPrimaryKey(Supplierfiles record) {
        return this.supplierfilesMapper.updateByPrimaryKey(record);
    }

    @Override
    public int selectCount() {
        return this.supplierfilesMapper.selectCount();
    }

    @Override
    public List<Supplierfiles> selectChang(selsupDto dto) {
        return this.supplierfilesMapper.selectChang(dto);
    }
}