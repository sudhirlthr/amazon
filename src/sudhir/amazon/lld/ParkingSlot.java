package sudhir.amazon.lld;

public class ParkingSlot {
    private long id;
    private String slotNumber;
    //ManyToOne
    private Floor floor;
    private Vehicle vehicle;
    private boolean isEmpty;
    private SlotSize slotSize;
}
