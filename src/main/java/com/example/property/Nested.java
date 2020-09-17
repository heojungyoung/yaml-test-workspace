package com.example.property;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Nested{
    private Integer a;
    private Integer b;
    private ArrayList<Integer> c = new ArrayList<>();
}