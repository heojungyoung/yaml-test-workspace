package com.example.property;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Sha256 {

    private Sha256(){}

    public static String testSHA256(String pwd) {
        try{

            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(pwd.getBytes(StandardCharsets.UTF_8));

            StringBuilder hexString = new StringBuilder();

            for(byte aa: hash){
                String hex = Integer.toHexString(0xff & aa);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            //출력
            return hexString.toString();

        } catch(NoSuchAlgorithmException ex){
            throw new RuntimeException(ex);
        }
    }
}