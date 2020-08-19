/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;

import java.util.ArrayList;


/**
 *
 * @author Lrandom
 */
public class DemoWildCard{
    void display(ArrayList<? extends Number> list){
        System.out.println(list);
    }
}
