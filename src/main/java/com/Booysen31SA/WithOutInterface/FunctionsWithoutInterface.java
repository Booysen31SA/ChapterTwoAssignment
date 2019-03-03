package com.Booysen31SA.WithOutInterface;

import java.lang.reflect.Array;
import java.util.*;

public class FunctionsWithoutInterface {
    private List list = new ArrayList();
    private Set set = new HashSet();
    private Map map = new HashMap();



   public void addingToList(String value){
       list.add(value);
   }

   public void addingToSet(String value){
       set.add(value);
   }

   public void addingToMap(String key, String value){
       map.put(key, value);
   }


}
