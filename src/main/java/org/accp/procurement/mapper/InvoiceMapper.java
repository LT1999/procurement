package org.accp.procurement.mapper;

import java.util.List;
import org.accp.procurement.entity.Invoice;

public interface InvoiceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Invoice record);

    Invoice selectByPrimaryKey(Integer id);

    List<Invoice> selectAll();

    int updateByPrimaryKey(Invoice record);
}