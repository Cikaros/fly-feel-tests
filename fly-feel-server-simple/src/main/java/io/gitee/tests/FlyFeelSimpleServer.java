package io.gitee.tests;

import io.gitee.core.entity.model.RestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 基础服务器
 *
 * @author Cikaros
 * @date 2022/3/22
 * @since v1.0
 */
@Controller
@SpringBootApplication
public class FlyFeelSimpleServer {

    private static final Logger log = LoggerFactory.getLogger(FlyFeelSimpleServer.class);

    public static void main(String[] args) {
        SpringApplication.run(FlyFeelSimpleServer.class, args);
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

}
