/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopjava14;

import java.util.StringTokenizer;

/**
 *
 * @author Lrandom
 */
public class Bai3 {
    public static void main(String[] args) {
        int mang[] = new int[10];
        mang[0] = 19;
        mang[1] = 20;
        mang[2] = 10;
        
        int mang2[] = {
            10,20,30,50,60
        };
        
        
        //System.out.println(mang[0]);//19
        //System.out.println(mang2[1]); // 20
        
        //System.out.println(mang[11]);//index out of bound exception
        
        /*for (int i = 0; i < mang.length; i++) {
            System.out.println(mang[i]);
        }
        
        for (int num: mang){
            System.out.println(num);
        }*/
        
        /*int[][] mang2d = new int[2][3];
        
        mang2d[0][0] = 1;
        mang2d[0][1] = 2;
        mang2d[0][2] = 3;
        
        mang2d[1][0] = 2;
        mang2d[1][1] = 1;
        mang2d[1][2] = 4;
        
        //123
        //214
        for (int i = 0; i < mang2d.length; i++) {
            for (int j = 0; j < mang2d[i].length; j++) {
                System.out.println(mang2d[i][j]);
            }
        }
        
        int[][] mang2d2 = new int[][]{
            {
              1,2,3
            },{
              2,1,4
            }
        };
        
        String a = "abc";
        
        a = "dbc";
        
        
        System.out.println(a);*/
        
        
        String a = "ABcd";
        System.out.println(a.charAt(0)); //return a
        
        char[] dst = new char[10];
        a.getChars(0, 2, dst, 2);
        
        System.out.println(dst);
        
        String b = "ABCD";
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
        
        System.out.println(a.compareTo(b));
        
        System.out.println(a.startsWith("a"));//true
        System.out.println(a.endsWith("E"));//false
        
        System.out.println(a.indexOf("A"));
        
        System.out.println(a.lastIndexOf("c"));
        
        System.out.println(a.substring(1));
        
        System.out.println(a.concat(b));
        
        System.out.println(a.replace("A","B"));
        
        String c = " 238232 ";
        System.out.println(c.trim());
        
        
        StringBuilder s1 = new StringBuilder("Hello world");
        
        System.out.println(s1.append("ABCD").toString()); //Hello world ABCD
        
        System.out.println(s1.delete(0, 3));
        
        System.out.println(s1.insert(0, "HGEF"));
       
        System.out.println(s1.reverse());
        
        System.out.println(s1.replace(0, 5, "ABCDE"));
        
        
        StringTokenizer tokens = new StringTokenizer("A B C");
        
        while(tokens.hasMoreElements()){
            System.out.println(tokens.nextElement());
        }
        
        System.out.println("\n\n\n\n");
        
        StringTokenizer tokens2 = new StringTokenizer("A-B-C","-");
        while (tokens2.hasMoreElements()) {
            System.out.println(tokens2.nextElement());
        }
        
        System.out.println("\n\n\n\n");
            
        StringTokenizer tokens3 = new StringTokenizer("A-B-C","-",true);
        while(tokens3.hasMoreElements()){
            System.out.println(tokens3.nextElement());
        }
    }
}
