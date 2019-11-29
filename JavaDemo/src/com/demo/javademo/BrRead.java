package com.demo.javademo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BrRead {
    public static void readDemo() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("按q退出");
            System.out.println((char) br.read());
        }while ((char) br.read() != 'q');
        System.out.println("+=================");
    }

    public static void main(String[] args) throws IOException {
        readDemo();
    }
}


