/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composition;

/**
 *
 * @author imrul
 */
public class Author {
    private String name;
    private String email;
    public Author(String n,String e){
        name=n;
        email=e;
    }
    public void setEmail(String e){
        this.email=e;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String toString() {
        return "Author[name=" + name + ",email=" + email + "]";
    }
}
