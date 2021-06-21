package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParkingLot {
    private List<ParkingSpot> parkingSpots=new ArrayList<>();

    public ParkingLot(){
        parkingSpots= Stream.of(new ParkingSpot(1,"two",true,1),
                new ParkingSpot(2,"two",true,2),
                new ParkingSpot(3,"four",true,3),
                new ParkingSpot(4,"two",true,4)).collect(Collectors.toList());
    }

    public ParkingSpot park(String vehicetype){
        ParkingSpot ps= parkingSpots.stream().filter(p->p.getType().equalsIgnoreCase(vehicetype) ).
                findFirst().orElse(null);
        ps.setFree(false);
        return ps;
    }

}
