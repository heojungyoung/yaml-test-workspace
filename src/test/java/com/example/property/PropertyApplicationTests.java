package com.example.property;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PropertyApplicationTests {

    @Value("${val.text}")
    private String val;

    @Autowired
    private Prop prop;

    @Test
    void contextLoads() {
        System.out.println("val : " + val);
        System.out.println("prop arr : " + prop.getArr().toString());
        System.out.println("prop arr2 : " + prop.getArr2().toString());
        System.out.println("prop arr3[0].a : " + prop.getArr3().get(0).getA());
        System.out.println("prop arr3[0].b : " + prop.getArr3().get(0).getB());
        System.out.println("prop arr3[0].c : " + prop.getArr3().get(0).getC());
        System.out.println("prop arr3[1].a : " + prop.getArr3().get(1).getA());
        System.out.println("prop arr3[1].b : " + prop.getArr3().get(1).getB());
        System.out.println("prop arr3[1].c : " + prop.getArr3().get(1).getC());
    }

}
