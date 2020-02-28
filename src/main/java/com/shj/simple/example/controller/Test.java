package com.shj.simple.example.controller;

public class Test {
    int a;

    public Test(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        System.out.println(new Test(1).hashCode());
        System.out.println(new Test(1).hashCode());
    }
}
