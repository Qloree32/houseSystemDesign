package house;

import house.rooms.Room;
import house.utilities.Utility;

public abstract class House {
    protected String address;
    private final int yearBuilt;

    public House(String address, int yearBuilt) {
        this.address = address;
        this.yearBuilt = yearBuilt;
    }

    public House() {
        this("Unknown", 2000);
    }

    public abstract void displayInfo();

    public void addRoom(Room room) {
        System.out.println("Adding room: " + room.getRoomType());
    }

    public void addUtility(Utility utility) {
        System.out.println("Adding utility: " + utility.getUtilityType());
    }
}
