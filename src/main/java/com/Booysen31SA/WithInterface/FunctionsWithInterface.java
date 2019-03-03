package com.Booysen31SA.WithInterface;

import java.util.*;

public class FunctionsWithInterface implements FunctionsInterface{

    private List list = new ArrayList();
    private Set set = new HashSet();
    private Map map = new HashMap();

    @Override
    public void addingToList(String value) {
        list.add(value);
    }

    @Override
    public void addingToSet(String value) {
        set.add(value);
    }

    @Override
    public void addingToMap(String key, String value) {
        map.put(key, value);
    }
}
