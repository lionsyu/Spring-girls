package com.spring;

import com.spring.entity.Cherry;
import com.spring.service.CherryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    CherryService cherryService;

    //樱桃下单
    @Test
    public void CherryOrderTest() {
        Cherry cherry = new Cherry();
        cherry.setConsumer_name("倪川来");
        cherry.setConsumer_tel("13989585262");
        cherry.setConsumer_addr("浙江省绍兴市上虞区百官街道春澜路555号");
        cherry.setCherry_type(Cherry.cherryTypes.meizao);
        cherry.setWeight(3);
        cherry.setUser("吴南杰");
        // cherry.setCost_price(180L);
        //cherry.setSell_price(180L);
        cherry.setIs_clean(Cherry.isClean.noClean);
        //cherry.setDescription("");
        cherryService.order(cherry);
    }

}
