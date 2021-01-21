package org.accp.procurement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author LT
 */
@SpringBootApplication
@MapperScan("org.accp.procurement.mapper")//配置mybatis扫描路径

public class ErpProcurementApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErpProcurementApplication.class, args);
    }

}
