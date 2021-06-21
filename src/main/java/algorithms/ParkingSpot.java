package algorithms;

public class ParkingSpot {
    int number;
    String type;
    boolean isFree;
    int floor;

    public ParkingSpot(int number, String type, boolean isFree, int floor) {
        this.number = number;
        this.type = type;
        this.isFree = isFree;
        this.floor = floor;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }


}
