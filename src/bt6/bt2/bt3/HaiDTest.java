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
public class HaiDTest extends Parent implements ITest{
    int x, y;

    public HaiDTest(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    
    @Override
    public Parent add(Parent parent) {
      HaiDTest obj = (HaiDTest)parent;
      return new HaiDTest(this.x+obj.x,this.y+obj.y);
    }
    
   
    
}
