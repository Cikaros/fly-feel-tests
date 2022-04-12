package io.gitee.tests.client;

import io.gitee.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Test
 *
 * @author Cikaros
 * @date 2022/4/11
 */
@FeignClient("${feign.paths.demo}/test1")
public interface TestFeignClient {

    @PostMapping("/demo")
    String demo(@RequestParam("id") String id);
}
