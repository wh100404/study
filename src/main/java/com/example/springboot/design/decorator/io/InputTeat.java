package com.example.springboot.design.decorator.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTeat {

    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new FileInputStream("src/main/resources/static/test.txt"));

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
