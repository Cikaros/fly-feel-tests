package io.gitee.tests;

import io.gitee.core.entity.model.BaseModel;
import io.gitee.core.entity.query.BaseQuery;
import io.gitee.define.entity.Client;
import io.gitee.define.mapper.ClientMapper;
import io.gitee.test.SpringBootTestParent;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

/**
 * @author Cikaros
 * @date 2021/12/20
 */
public class TestsSpringbootTest extends SpringBootTestParent {

    private final Logger log = LoggerFactory.getLogger(TestsSpringbootTest.class);

    @Autowired
    private FlyFeelLicenseServer flyFeel;

    @Test
    public void test1() {
        PodamFactory factory = new PodamFactoryImpl();
        BaseModel query = factory.manufacturePojo(BaseQuery.class);
        log.info("{}", query);
        Long time = System.currentTimeMillis();
        Object clone = query.clone(BaseModel.Field.ID, BaseModel.Field.ENABLE, BaseModel.Field.DEL);
        Long time1 = System.currentTimeMillis();
        log.info("{}", clone);
        System.out.printf("time:%d毫秒%n", time1 - time);
    }

    @Autowired
    private ClientMapper clientMapper;

    @Autowired
    private PodamFactory podamFactory;

    @Test
    public void test() {
        Client client = podamFactory.manufacturePojo(Client.class);
        log.debug("{}", client);
        int i = clientMapper.insertSelective(client);
        log.debug("{}", i);
    }

    @Test
    public void test2() {
        Client client = clientMapper.selectByPrimaryKey(1L);
        log.debug("{}", client);
        client = clientMapper.selectByPrimaryKey(2L);
        log.debug("{}", client);
    }


}
