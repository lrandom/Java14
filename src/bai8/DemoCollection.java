/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Lrandom
 */
public class DemoCollection {
    static class User{
       int id;
       String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }
       
    }
    
    public static void main(String[] args) {
        /*ArrayList<String> test = new ArrayList<>();
        test.add("Hello");
        test.add(0,"Hi");
        
        for (int i = 0; i < test.size(); i++) {
            System.out.println(test.get(i));
        }
        
        for (String obj : test) {
            System.out.println(obj);
        }
        
        test.remove("Hello");
        test.remove(0);*/
        
        /*HashMap<String, User> myHashMap = new HashMap<>();
        myHashMap.put("Luan", new User(1,"Nguyen Thanh Luan"));
        myHashMap.put("Long", new User(2, "Jackky Long"));
        //myHashMap.get("Luan");
        //System.out.println(myHashMap.get("Luan").name);
        
        Set<Map.Entry<String,User>> entrys = myHashMap.entrySet();
        for (Map.Entry<String,User> entry: entrys) {
            String key = entry.getKey();
            User user = entry.getValue();
            System.out.println(user.id);
        }
        
        for (Iterator<Map.Entry<String, User>> iterator = entrys.iterator(); iterator.hasNext();) {
            Map.Entry<String, DemoCollection.User> next = iterator.next();
            System.out.println(next.getValue().id);
        }*/
        
        
        HashSet<String> test = new HashSet<>();
        for (int i = 0; i < test.size(); i++) {
            System.out.println(test.toArray()[i]);
        }
    }
}
