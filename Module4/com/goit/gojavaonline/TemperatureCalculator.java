package com.goit.gojavaonline;

public class TemperatureCalculator {
    public double fahrenheitToCelsiusConverter(double fahrenheitDegrees){
        double celsiusDegrees = (5/9) * (fahrenheitDegrees - 32);
        return celsiusDegrees;
    }

    public double celsiusToFahrenheitConverter(double celsiusDegrees){
        double fahrenheitDegrees = (9/5) * celsiusDegrees + 32;
        return fahrenheitDegrees;
    }
}
