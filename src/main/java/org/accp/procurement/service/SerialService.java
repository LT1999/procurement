package org.accp.procurement.service;


import org.accp.procurement.entity.Serial;

/**
 * <p>
 * 流水号
 * </p>
 *
 * @author dss
 * @since 2020-12-3
 */
public interface SerialService {

    //产品编号
    String productId(Serial serial);

    //物料设计单编号
    String moduleId(Serial serial);

    //工序设计单编号
    String gxId(Serial serial);

    // 生产计划编号
    String scjhId(Serial serial);

	// 生产编号
    String scId(Serial serial);

	// 库存编号
    String kcId(Serial serial);

	// 入库单编号
    String rkId(Serial serial);

	// 出库单编号
    String ckId(Serial serial);
}
