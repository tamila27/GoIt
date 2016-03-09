package com.goit.gojavaonline;

public class DistanceCalculator {
    public double calculateDistanceBetween2Points(double x1, double x2, double y1, double y2){
        double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        return distance;
    }
}