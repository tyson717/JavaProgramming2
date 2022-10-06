package day25_constructors;

public class Rectangle {

    public double length, width;

    public double area(){
        return length*width;
    }
/*
public void setInfo(double length, double width){
this.width=width;
this.length=length;
}*/

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;

    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area() +
                '}';
    }
}
