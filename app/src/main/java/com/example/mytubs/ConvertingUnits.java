package com.example.mytubs;

public class ConvertingUnits {
    //class to convert units of area
    static class Area{
        public double sqMilliToMeter(double milli)
        {
            return (milli/1000000);
        }

        public double sqMeterToMilli(double meter)
        {
            return (meter*1000000);
        }

        public double sqCentiToMeter(double Centi)
        {
            return (Centi/10000);
        }

        public double sqMeterToCenti(double meter)
        {
            return (meter*10000);
        }

        public double sqKiloToMeter(double Kilo)
        {
            return (Kilo*1000000);
        }

        public double sqMeterToKilo(double meter)
        {
            return (meter/1000000);
        }

        public double AcreToMeter(double acre)
        {
            return (acre*4046.86);
        }

        public double sqMeterToAcre(double meter)
        {
            return (meter/4046.86);
        }

        public double HectareToMeter(double Hectare)
        {
            return (Hectare*10000);
        }

        public double sqMeterToHectare(double meter)
        {
            return (meter/10000);
        }
    }
}
