
package Polymorphism;

public class Rectangle extends Shape {
    
    protected double width=1.0;
    protected double length=1.0;

    public Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width,double length,String color, boolean filled) {
        super(color, filled);
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}';
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    @Override
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return width+length+width+length;
    }
}
