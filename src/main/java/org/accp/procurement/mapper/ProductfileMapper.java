package org.accp.procurement.mapper;

import org.accp.procurement.entity.Productfile;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface ProductfileMapper {

    List<Productfile> selectProduct();
}
