package de.telran.sammaryTask;

public class RailwayStationType implements Hub{

    @Override
    public boolean canUse(Vehicle vehicle) {
        if (vehicle instanceof Train){
            return true;
        } else {
            return false;
        }
    }
}
