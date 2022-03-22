package io.gitee.tests;

import io.gitee.core.entity.model.RestResult;
import io.gitee.security.context.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
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
public class FlyFeelResourceServer {

    private static final Logger log = LoggerFactory.getLogger(FlyFeelResourceServer.class);

    public static void main(String[] args) {
        SpringApplication.run(FlyFeelResourceServer.class, args);
    }

    @PostMapping("/index")
    @ResponseBody
    public RestResult index2() {
        return RestResult.success(SecurityUtils.getUserDetails().toString());
    }

}

