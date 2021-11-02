package com.company;

import java.util.Arrays;

public class AppleProducts {

    Iphone[] appleProducts;

    public AppleProducts() {
        this.appleProducts = new Iphone[0];
    }

    public int sum() {
        System.out.println(appleProducts.length + " Products in Array");
        return 0;
    }

    public int max() {
        Arrays.sort(appleProducts);
        System.out.println("Element with max value in the Array -> " + appleProducts[appleProducts.length - 1]);
        return 0;
    }

    public int min() {
        Arrays.sort(appleProducts);
        System.out.println("Element with min value in the Array ->" + appleProducts[0]);
        return 0;
    }

    public int evenSum() {
        double evenSum = 0;
        for (int i = 0; i <= appleProducts.length - 1; i++) {
            if (appleProducts[i].getValue() % 2 == 0) {
                evenSum += appleProducts[i].getValue();
            }
        }
        System.out.println("Sum of all even numbers in Array is -> "+evenSum);
        return (int) evenSum;
    }

    public int strLength(String s) {
        int i = 0;
        char ch[] = s.toCharArray();
        for (char c : ch) {
            i++;
        }
        System.out.println("String Length is -> "+i);
        return 0;
    }

    public String oddString(String s) {
        int i = 0;
        String newStr = "";
        for (i = 0; i < s.length(); i++) {
            if (i % 2 == 1) {
                newStr += s.charAt(i);
            }
        }
        System.out.println(newStr);
        return newStr;
    }

    public boolean addAppleProduct(Iphone product) {

        if (product.getValue() >= 0) {
            this.appleProducts = Arrays.copyOf(appleProducts, appleProducts.length + 1);
            this.appleProducts[this.appleProducts.length - 1] = product;
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "AppleProducts{" + Arrays.toString(appleProducts) +
                '}';
    }
}
