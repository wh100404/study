package com.example.springboot.design.singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    public ChocolateBoiler() {
        boiled = false;
        empty = true;
    }

    public void fill() {
        if (isEmpty()) {
            //锅炉放入原料，锅炉必须是空的。一旦放入原料，就把empty和boiled设置好
            empty = false;
            boiled = false;
            //在锅炉内填满巧克力和牛奶的混合物
        }
    }

    public void drain() {
        if (isBoiled() && !isEmpty()) {
            //排出煮沸的巧克力和牛奶
            empty = false;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            //将炉内物煮沸
            boiled = true;
        }
    }


    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
