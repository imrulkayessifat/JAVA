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
public class Book{
    private String isbn;
    private String name;
    private Double price;
    private Integer qty;
    private Author a1;
    
    public Book(String isb,String nam,Author a,Double pric,Integer qt){
        isbn=isb;
        name=nam;
        price=pric;
        qty=qt;
        a1=a;
    }
    public String toString() {
        return "Book[isbn=" + isbn + ",name=" + name +","+a1.toString()+",price="+price+",qty="+qty+"]";
    }
    
    public void setPrice(Double p){
        this.price=p;
    }
    public void setQty(Integer q){
        this.qty=q;
    }
    public String getIsbn(){
        return isbn;
    }
    public String getName(){
        return name;
    }
    public Double getPrice(){
        return price;
    }
    public Integer getQty(){
        return qty;
    }
    public Author getAuthor(){
        return a1;
    }
    public String getAuthorName(){
        return a1.getName();
    }
}
