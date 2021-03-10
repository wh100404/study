package com.example.springboot.jvm;

import java.util.ArrayList;
import java.util.List;

public class HeapOOM {

    static class OOBObject{

    }

    public static void main(String[] args) {
        List<OOBObject> list = new ArrayList<>();

        while (true) {
            list.add(new OOBObject());
        }
    }
}
