package io.gitee.tests;

import io.gitee.test.SpringBootTestParent;
import io.gitee.tests.client.TestFeignClient;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Cikaros
 * @date 2022/3/25
 * @since v1.0
 */
public class SimpleTest extends SpringBootTestParent {

    @Autowired
    private TestFeignClient client;

    @Test
    public void run() {
        String demo = client.demo("Cikaros");
        System.out.println(demo);
    }

}
