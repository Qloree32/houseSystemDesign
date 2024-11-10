package house;

import house.utilities.Utility;
import house.rooms.Room;

public class HouseManager extends House implements HouseOperations {
    private String managerName;

    public HouseManager(String address, int yearBuilt, String managerName) {
        super(address, yearBuilt);
        this.managerName = managerName;
    }

    public HouseManager() {
        super();
        this.managerName = "Default Manager";
    }

    @Override
    public void displayInfo() {
        System.out.println("House managed by: " + managerName);
    }

    @Override
    public void scheduleCleaning() {
        System.out.println("Cleaning scheduled by " + managerName);
    }
}
