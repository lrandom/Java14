/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package7;

/**
 *
 * @author Lrandom
 */
public class TestException extends Exception{

    public TestException() {
    }

    @Override
    public String getMessage() {
        return "Tiền trong tài khoản không đủ";
    }
    
}
