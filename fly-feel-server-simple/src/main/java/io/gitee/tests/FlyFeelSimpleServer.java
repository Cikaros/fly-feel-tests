package io.gitee.tests;

import io.gitee.openfeign.EnableFeignClients;
import io.gitee.tests.client.TestFeignClient;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
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
@EnableFeignClients("io.gitee.tests.client")
@SpringBootApplication
public class FlyFeelSimpleServer implements CommandLineRunner {

    private final Logger log = Logger.getLogger(FlyFeelSimpleServer.class);

    @Autowired
    private TestFeignClient client;

    public static void main(String[] args) {
        SpringApplication.run(FlyFeelSimpleServer.class, args);
    }

    @Override
    public void run(String... args) {
        String demo = client.demo("Cikaros");
        log.info(demo);
    }
}
