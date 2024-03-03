package kg.Kursanov.task1;

import java.util.Scanner;

public enum TransportType {

    CAR(0.1),
    BUS(0.5),
    TRUCK(0.3);

    double travelTime;

    TransportType(double travelTime) {
        this.travelTime = travelTime;
    }



    public double calculateTravelCost(double distance) {
        return travelTime * distance;

    }
}

