package sudhir.amazon.lld.impl;

import sudhir.amazon.lld.Vehicle;
import sudhir.amazon.lld.VehicleType;

public class Bike implements Vehicle {
    public VehicleType vehicleType;
    public Long vehicleNumber;


    public Long getVehicleNumber() {
        return vehicleNumber;
    }

    public Bike(long vehicleNumber) {
        this.vehicleType = VehicleType.BIKE;
        this.vehicleNumber = vehicleNumber;
    }

    @Override
    public VehicleType getVehicleType() {
        return VehicleType.BIKE;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "vehicleType=" + vehicleType +
                ", vehicleNumber=" + vehicleNumber +
                '}';
    }
}
