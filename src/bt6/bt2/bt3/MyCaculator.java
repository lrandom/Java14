/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt6.bt2.bt3;

/**
 *
 * @author Lrandom
 */
public class MyCaculator implements Caculator{

    @Override
    public float add(int a, int b) {
      return a+b;
    }

    @Override
    public float minus(int a, int b) {
      return a-b;
    }

    @Override
    public float multiple(int a, int b) {
       return a*b;
    }

    @Override
    public float devide(int a, int b) {
       return a/b;
    }
    
    public static void main(String[] args) {
        MyCaculator myCaculator = new MyCaculator();
        float a = myCaculator.add(1, 2);
        System.out.println(a);
        a=myCaculator.minus(1,2);
        System.out.println(a);
        a=myCaculator.multiple(10, 2);
        System.out.println(a);
        a=myCaculator.devide(1, 2);
        System.out.println(a);
    }
}
