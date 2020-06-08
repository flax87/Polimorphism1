package com.company;

public class Rectungle implements IGeometry, IPackaging {

    private int id;
    private int length;
    private int width;
    public final double PI = 3.14;

//Constructor
    public Rectungle(int id, int length, int width) {
        this.id = id;
        this.length = length;
        this.width = width;
    }
//Get & Set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getPI() {
        return PI;
    }


//implements IGeometry

    @Override
    public double getArea() {
        return this.getLength() * this.getWidth();
    }

    @Override
    public double getLinearLength() {
        return 2 * this.getLength() * this.getWidth();
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