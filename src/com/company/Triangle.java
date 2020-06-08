package com.company;

public class Triangle  implements IGeometry, IPackaging{

    private double a;
    private double b;
    private double c;


    //Constructor

    public Triangle(double b, double c) {
        this.b = b;
        this.c = c;
    }

    //Get & Set

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


    //implements IGeometry

    @Override
    public double getArea() {
        double semi = this.getLinearLength() /2;
        return  Math.sqrt(semi * (semi - a) * (semi -b) * (semi -c) );
    }

    @Override
    public double getLinearLength() {
        return a + b + c;
    }

    @Override
    public String toJSON() {
        return null;
    }

    @Override
    public String toXML() {
        return null;
    }

    @Override
    public void toConsole() {

    }
}
