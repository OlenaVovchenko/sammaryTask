package de.telran.sammaryTask;
// Реализовать программу, которая представляет собой транспортную систему, в которой:
// Есть хабы (типы): аэропорт, автобусные остановка и ЖД вокзал.
// А также есть транспорт: самолёты, вертолеты, поезда и автобусы

// Нам необходимо создать набор транспортных хабов и конкретного транспорта и для каждого хаба посчитать
// сколько единиц траспорта им может пользоваться

// airport.canUse(transport1) => boolean

// На выходе я хочу получить статистику по типам, реализуемая в отдельном методе:
// airport: 2
// bus station: 5
// railway station: 3

// Так не надо Hub[] = new Hub[] {busStation1, busStation2};
// А вот так надо Hub[] new Hub[] {airport, busStation, railwayStation};
// void calculateTransportObjectsPerHub(Hub[] hub, Transport[] transports)
public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        Bus bus3 = new Bus();

        Plane plane1 = new Plane();
        Plane plane2 = new Plane();
        Plane plane3 = new Plane();

        Train train1 = new Train();
        Train train2 = new Train();
        Train train3 = new Train();

        AirportType airportType = new AirportType();
        boolean result = airportType.canUse(plane1);
        System.out.println(result);
        RailwayStationType railwayStationType = new RailwayStationType();
        calculateVehicleObjectsPerHub(new Hub[] {airportType, railwayStationType},
                new Vehicle[]{plane1, train1});
    }
    static void calculateVehicleObjectsPerHub(Hub[] hubs, Vehicle[] vehicles) {
        int planeCount = 0;
        int busCount = 0;
        int trainCount = 0;
        for (Vehicle vehicle : vehicles) {
            for (Hub hub : hubs) {
                if (hub.canUse(vehicle) && hub instanceof AirportType) {
                    planeCount += 1;
                } else if (hub.canUse(vehicle) && hub instanceof BusStationType) {
                    busCount += 1;
                } else if (hub.canUse(vehicle) && hub instanceof RailwayStationType) {
                    trainCount += 1;
                }
            }
        }
        System.out.println(planeCount);
        System.out.println(busCount);
        System.out.println(trainCount);


    }
}
