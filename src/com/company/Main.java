package com.company;

public class Main {

    public static void main(String[] args) {


        AppleProducts ob = new AppleProducts();
        ob.addAppleProduct(new Iphone(999, "iPhone 13 Pro"));
        ob.addAppleProduct(new Iphone(1094, "iPhone 13 Pro Max"));
        ob.addAppleProduct(new Iphone(599, "iPhone 12"));
        System.out.println(ob.toString());
        ob.sum();
        ob.max();
        ob.min();
        ob.evenSum();
        ob.strLength("String");
        ob.oddString("asdqwe");
    }
}
