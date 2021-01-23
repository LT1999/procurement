package org.accp.procurement.service.impl;
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
    public List<Supplierfiles> findCheck() {
        return this.supplierfilesMapper.findCheck();
    }

    @Override
    public int addSupplierfiles(Supplierfiles supplierfiles) {
        return 0;
    }

    @Override
    public Supplierfiles selectByPrimaryKey(Integer id) {
        return this.supplierfilesMapper.selectByPrimaryKey(id);
    }
}