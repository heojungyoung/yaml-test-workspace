package com.example.property;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@ContextConfiguration
@SpringBootTest(classes = PropertyApplication.class)
class PropertyApplicationTests {

    @Value("${val.text}")
    private String val;

    // @Autowired
    // private Prop prop;

    @Value("${serial.number}")
    private String list;

    @Value("${sequence.number}")
    private List<String> plist;

    @Value("${sequence.default.ver}")
    private String ver;

    @Test
    void contextLoads() {
        System.out.println("val : " + val);
      /*  System.out.println("prop arr : " + prop.getArr().toString());
        System.out.println("prop arr2 : " + prop.getArr2().toString());
        System.out.println("prop arr3[0].a : " + prop.getArr3().get(0).getA());
        System.out.println("prop arr3[0].b : " + prop.getArr3().get(0).getB());
        System.out.println("prop arr3[0].c : " + prop.getArr3().get(0).getC());
        System.out.println("prop arr3[1].a : " + prop.getArr3().get(1).getA());
        System.out.println("prop arr3[1].b : " + prop.getArr3().get(1).getB());
        System.out.println("prop arr3[1].c : " + prop.getArr3().get(1).getC());*/

        System.out.println("list : " + list);

        System.out.println("serviceIds arr3[1].c : " + plist);

        System.out.println("list : " + ver);




    }

}
