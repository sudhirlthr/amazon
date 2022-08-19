package sudhir.amazon.lld.impl;

import sudhir.amazon.lld.Vehicle;
import sudhir.amazon.lld.VehicleType;

public class Car implements Vehicle {

    public VehicleType vehicleType;
    public Long vehicleNumber;

    public Car(VehicleType vehicleType) {
        this.vehicleType = VehicleType.SEDAN;
        this.vehicleNumber = vehicleNumber;
    }

    @Override
    public VehicleType getVehicleType() {
        return VehicleType.SEDAN;
    }

    public Long getVehicleNumber() {
        return vehicleNumber;
    }

}
