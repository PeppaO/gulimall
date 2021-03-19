package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Describe
 * @Author fdr
 * @Date 2021/03/19
 * 1.整合MyBatis-Plus
 *      1）、导入依赖
 *         <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.4.2</version>
 *         </dependency>
 *      2）、配置
 *          1、配置数据源:
 *              1）、导入数据库驱动
 *               <dependency>
 *                 <groupId>mysql</groupId>
 *                 <artifactId>mysql-connector-java</artifactId>
 *                 <version>8.0.16</version>
 *               </dependency>
 *               2）、在application.yml配置数据源相关信息
 *          2、配置MyBatis-Plus:
 *              1）、使用@MapperScan
 *              2）、告诉MyBatis-Plus，sql映射文件
 */
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class,args);
    }
}
