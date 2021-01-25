package org.accp.procurement.service.impl;
import org.accp.procurement.dto.supplierDto;
import org.accp.procurement.entity.Supplierfiles;

import org.accp.procurement.entity.Supplierfiles;
import org.accp.procurement.mapper.SupplierfilesMapper;
import org.accp.procurement.service.SupplierfilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<Supplierfiles> findCheck() { return this.supplierfilesMapper.findCheck();}

    @Override
    public int addSupplierfiles(Supplierfiles supplierfiles) {
        return 0;
    }

    @Override
    public Supplierfiles selectByPrimaryKey(Integer id) {
        return this.supplierfilesMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Supplierfiles> findss(supplierDto dto) {
        if (dto != null) {
            if (dto.getFl1() == 0 && dto.getTime1() != null) {
                return this.supplierfilesMapper.findss2(dto);
            } else if (dto.getTime1() == null && dto.getFl1() != 0) {
                return this.supplierfilesMapper.findss1(dto);
            } else {
                return this.supplierfilesMapper.findss(dto);
            }
        }else{
            return this.supplierfilesMapper.selectAll();
        }
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Supplierfiles record) {
        return this.supplierfilesMapper.insert(record);
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
        return 0;
    }
}