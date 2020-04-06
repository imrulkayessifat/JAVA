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
public class Car {
    Wheel whel1;
    Wheel whel2;
    Wheel whel3;
    Wheel whel4;
    
    private int doors = 2;
    private int window = 4;
    private int seats = 2;
    final int bonnet = 1;
    
    public int getDoors(){
        return doors;
    }
    
    public void setDoors(int doors){
        if(doors>=2){
            this.doors = doors;
        }
    }
}
