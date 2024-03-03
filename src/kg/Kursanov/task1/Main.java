package kg.Kursanov.task1;

public class Main {
    public static void main(String[] args) {


        TransportType car = TransportType.CAR;
        TransportType bus = TransportType.BUS;
        TransportType truck = TransportType.TRUCK;

        System.out.println("Стоимость ехать в грузовике: " + truck.calculateTravelCost(100)+ "$");
        System.out.println("Стоимость ехать в автобусе: " + bus.calculateTravelCost(100)+ "$");
        System.out.println("Стоимость ехать в легкого машине: " + car.calculateTravelCost(100)+ "$");

    }
}