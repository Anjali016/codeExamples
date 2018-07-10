package com.company.www.utils;

import com.company.www.utils.ifaces.GraphInterface;

public class Graph<T> implements GraphInterface<T> {
    @Override
    public boolean contains(T vertex) {
        return false;
    }

    @Override
    public void add(T vertex) {

    }

    @Override
    public void connection(T from, T to) {

    }

    @Override
    public void size() {

    }

    @Override
    public void remove(T vertex) {

    }
}
