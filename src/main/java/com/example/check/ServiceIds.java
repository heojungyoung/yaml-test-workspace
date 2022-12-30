package com.example.check;


import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "val3")
public class ServiceIds {

    private Map<String, Info> a13;

    public ServiceIds(Map<String, Info> a13) {
        this.a13 = a13;
    }

    public Map<String, Info> getA13() {
        return a13;
    }

}
