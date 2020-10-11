package com.javafortesters.myfirsttest;

import org.junit.Test;

public class Main {

    @Test
    public static void main(String[] args) {

        System.out.println("Hello world") ;

        Product product = new Product( "Keyboard");

        System.out.println(product.getName());
        System.out.println("product");

        String message = "Heloo how are you";
        System.out.println(message);


    }



}