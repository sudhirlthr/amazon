package sudhir.amazon.lld;

import java.util.List;

public class Floor {
    private long id;
    private Integer floorNumber;
    //OneToMany
    List<ParkingSlot> parkingSlots;
    private Integer buildingNumber;
}
