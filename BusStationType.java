package de.telran.sammaryTask;

public class BusStationType implements Hub{

    @Override
    public boolean canUse(Vehicle vehicle) {
        if (vehicle instanceof Bus){
            return true;
        } else {
            return false;
        }
    }
}
