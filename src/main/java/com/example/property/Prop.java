package com.example.property;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@ConfigurationProperties(prefix = "val2")
@Getter
public class Prop {
    private ArrayList<Integer> arr = new ArrayList<>();
    private ArrayList<Integer> arr2 = new ArrayList<>();
    private ArrayList<Nested> arr3 = new ArrayList<>();
}


