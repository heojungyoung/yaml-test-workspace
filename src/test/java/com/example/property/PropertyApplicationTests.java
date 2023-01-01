package com.example.property;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import java.util.List;


@ContextConfiguration
@SpringBootTest
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

        /* 암호화할 텍스트 */
        String text = "Hello, Java";

        /* SHA256 암호화 */
        String encryptSHA256 = Sha256.testSHA256(text);

        /* SHA256 암호화 결과 */
        System.out.println("SHA256 암호화 요청 텍스트 : " + text);
        System.out.println("SHA256 암호화 완료 텍스트 : " + encryptSHA256);

    }

}
