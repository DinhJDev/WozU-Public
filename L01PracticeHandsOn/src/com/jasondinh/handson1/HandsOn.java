package com.jasondinh.handson1;

public class HandsOn {
    public static void main(String[] args) {
        boolean isSunny = true;
        boolean atBeach = true;
        if (isSunny == true) {
            System.out.println("Wear sunglasses!");
            if (atBeach == true) {
                System.out.println("Wear sunblock!");
            } else {
                System.out.println("Don't need sunblock.");
            }
        } else {
            System.out.println("Don't wear sunglasses.");
            if (atBeach == true) {
                System.out.println("Come back tomorrow.");
            } else {
                System.out.println("Don't go to the beach.");
            }
        }
    }
}
