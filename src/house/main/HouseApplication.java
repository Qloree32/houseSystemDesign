package house.main;

import house.rooms.Bedroom;
import house.HouseManager;
import house.security.Alarm;
import house.utilities.Electricity;

public class HouseApplication {
    public static void main(String[] args) {
        // Create a HouseManager instance
        HouseManager houseManager = new HouseManager("2357 Dirt Road", 2024, "Yadayada Sir Mcgee");

        // Display information about the house
        houseManager.displayInfo();

        // Create and add a Bedroom
        Bedroom bedroom = new Bedroom(150, true);
        houseManager.addRoom(bedroom);

        // Create and add a Utility
        Electricity electricity = new Electricity(240);
        houseManager.addUtility(electricity);
        
        // Operate the utility
        electricity.operate();

        // Set up and arm an alarm system
        Alarm alarm = new Alarm(2);
        alarm.armSystem();
        alarm.triggerAlarm();

        // Schedule cleaning
        houseManager.scheduleCleaning();
    }
}
