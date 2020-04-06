/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritence;

/**
 *
 * @author imrul
 */
public class sezanCar extends Car{

    private int getDoors;
    
    public void test(){
        super.setDoors(4);
        
    }
    
    public static void main(String[] args) {
        sezanCar s=new sezanCar();
        s.test();
        System.out.println(s.getDoors);
        
    }
    
}
