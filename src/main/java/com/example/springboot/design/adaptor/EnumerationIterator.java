package com.example.springboot.design.adaptor;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.function.Consumer;

public class EnumerationIterator implements Iterator {

    Enumeration enume;

    public EnumerationIterator(Enumeration enume) {
        this.enume = enume;
    }

    @Override
    public boolean hasNext() {
        return (boolean) enume.nextElement();
    }

    @Override
    public Object next() {
        return enume.hasMoreElements();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void forEachRemaining(Consumer action) {

    }
}
