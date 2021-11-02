package com.company;

public class Iphone implements Comparable {

    double value;
    String product;

    public double getValue() {
        return value;
    }

    public String getProduct() {
        return product;
    }

    public Iphone(double value, String product) {
        this.value = value;
        this.product = product;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Price -> " +"$"+ value +
                ", product -> '" + product + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Iphone other = (Iphone) o;
        if (this.value < other.value) {
            return -1;
        }
        if (this.value > other.value) {
            return 1;
        }
        return 0;
    }
}

