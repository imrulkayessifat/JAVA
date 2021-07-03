/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author imrul
 */

interface Employee{
    void name(String name);
    void phoneNo(String phoneNo);
    void address(String addressNo);
}
public class NewEmployee implements Employee {
    String name="";
    String phoneNo="";
    String address="";
    
    public void name(String name){
        this.name=name;
    }
    
    void printPersonInfo(){
        System.out.println(name+"\n"+address+"\n"+phoneNo);
    }
    public static void main(String[] args) {
        NewEmployee p = new NewEmployee();
        p.name("Jacob");
        p.phoneNo("2342423");
        p.address("sylhet");
        p.printPersonInfo();
    }

    @Override
    public void phoneNo(String phoneNo) {
        this.phoneNo=phoneNo; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void address(String addressNo) {
        this.address=addressNo; //To change body of generated methods, choose Tools | Templates.
    }
}
