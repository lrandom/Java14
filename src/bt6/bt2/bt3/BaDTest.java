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
public class BaDTest extends Parent implements ITest{
    int x, y, z;

    public BaDTest(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    
    @Override
    public Parent add(Parent parent) {
      BaDTest obj = (BaDTest)parent;
      return new BaDTest(this.x+obj.x,this.y+obj.y,this.z+obj.z);
    }
    
}
