package com.goit.gojavaonline;

public class ShapeAreaCalculator {

    public double calculateTriangleArea(double aSide, double bSide, double cSide){
        double perimeter = (aSide + bSide + cSide)/2;
        double area = Math.sqrt(perimeter*(perimeter - aSide)*(perimeter - bSide)*(perimeter - cSide));
        return area;
    }

    public double calculateRectangleArea(double aSide, double bSide){
        double area = aSide * bSide;
        return area;
    }
    public double calculateCircleArea(double radius){
        double area = Math.PI * radius * radius;
        return  area;
    }
}
