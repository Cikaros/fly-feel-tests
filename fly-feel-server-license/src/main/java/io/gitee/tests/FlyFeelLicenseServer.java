package io.gitee.tests;

import io.gitee.core.entity.model.RestResult;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 启动程序
 *
 * @author Cikaros
 * @date 2021/12/19
 */
@Controller
@SpringBootApplication
@MapperScan("io.gitee.define.mapper")
public class FlyFeelLicenseServer {

    private static final Logger log = LoggerFactory.getLogger(FlyFeelLicenseServer.class);

    public static void main(String[] args) {
        SpringApplication.run(FlyFeelLicenseServer.class, args);
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @PostMapping("/index")
    @ResponseBody
    public RestResult index2() {
        return RestResult.error();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

}

