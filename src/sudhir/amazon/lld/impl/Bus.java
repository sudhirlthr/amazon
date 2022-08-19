package sudhir.amazon.lld.impl;

import sudhir.amazon.lld.Vehicle;
import sudhir.amazon.lld.VehicleType;

public class Bus implements Vehicle {

    private long vehicleNumber;
    private VehicleType vehicleType;

    public Bus(long vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = VehicleType.BUS;
    }

    @Override
    public VehicleType getVehicleType() {
        return null;
    }
    public long getVehicleNumber() {
        return vehicleNumber;
    }
}
