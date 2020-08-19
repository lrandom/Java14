/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Lrandom
 */
public class Test <T> {
    /*private T number;
    private V number2;
    
    public T getNumber(T number2){
        return number2;
    }
    
    public V getNumber2(V number2){
        return number2;
    }*/
    
    public void test(T t){
        System.out.println(t);
    }
    
    public void testWildCard(List<?> list){
        ///System.out.println(list);
        // Collection<?> c = new ArrayList<String>();
        // c.add("1q21212 ");
        //list.add(new Rectangle());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    
    public void test2(Test<? extends Shape> test4){
        System.out.println(test4);
    }
    
    public static void main(String[] args) {
        Test<? extends Shape> test = new Test();
        
        //System.out.println(test.getNumber(new Float(1.4)));
       // System.out.println(test.getNumber2(2));
        List<Shape> shapes = new ArrayList<Shape>();
        test.testWildCard(shapes);
        test.test2(new Test<Rectangle>());
        //test.test(new Rectangle());
    }
    
    
}
