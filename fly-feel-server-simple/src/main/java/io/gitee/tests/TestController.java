package io.gitee.tests;

import io.gitee.tests.client.TestFeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author Cikaros
 * @date 2022/4/11
 */
@RestController
@RequestMapping("/test1")
public class TestController implements TestFeignClient {


    @Override
    public String demo(String id) {
        return String.format("您的请求参数为:%s", id);
    }
}
