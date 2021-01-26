package org.accp.procurement.service.impl;

import org.accp.procurement.entity.Linkman;
import org.accp.procurement.mapper.LinkmanMapper;
import org.accp.procurement.service.LinkmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 联系人信息表服务接口实现
 *
 * @author LT
 * @since 2021-01-16 14:46:04
 * @description 
 */
@Service
public class LinkmanServiceImpl implements LinkmanService {
    @Autowired
    private LinkmanMapper linkmanMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

  /*  @Override
    public int insert(Linkman record) {
        return this.linkmanMapper.insert(record);
    }*/

    @Override
    public Linkman selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<Linkman> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(Linkman record) {
        return 0;
    }
}