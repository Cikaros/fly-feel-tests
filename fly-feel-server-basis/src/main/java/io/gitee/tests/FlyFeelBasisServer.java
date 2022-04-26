package io.gitee.tests;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

/**
 * 基础服务器
 *
 * @author Cikaros
 * @date 2022/3/22
 * @since v1.0
 */
@Controller
@SpringBootApplication
@MapperScan("io.gitee.define.mapper")
public class FlyFeelBasisServer {

    public static void main(String[] args) {
        SpringApplication.run(FlyFeelBasisServer.class, args);
    }

}
