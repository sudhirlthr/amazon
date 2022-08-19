package sudhir.amazon.lld;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ParkingDetails {
    Vehicle vehicle;
    ZonedDateTime entryTime = LocalDateTime.now().atZone(ZoneId.of("IST"));
    ZonedDateTime exitTime = LocalDateTime.now().atZone(ZoneId.of("IST"));
    ParkingSlot parkingSlot;
}
