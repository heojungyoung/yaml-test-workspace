package com.example.property;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

import static org.springframework.test.util.AssertionErrors.assertEquals;

// @ContextConfiguration
// @SpringBootTest(classes = PropertyApplication.class)
class PropertyApplicationTests {

    @Value("${val.text}")
    private String val;

    @Value("${serial.number}")
    private String list;

    @Value("${sequence.number}")
    private List<String> plist;

    @Value("${sequence.default.ver}")
    private String ver;

    @Test
    public void propTest(){

        System.out.println("val : " + val);


        System.out.println("list : " + list);

        System.out.println("serviceIds arr3[1].c : " + plist);

        System.out.println("list : " + ver);

    }




}
