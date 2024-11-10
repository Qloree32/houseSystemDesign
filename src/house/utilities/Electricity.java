package house.utilities;

public class Electricity implements Utility {
    private int voltage;

    public Electricity(int voltage) {
        this.voltage = voltage;
    }

    public Electricity() {
        this(220);
    }

    @Override
    public String getUtilityType() {
        return "Electricity";
    }

    @Override
    public void operate() {
        System.out.println("Electricity is operating at " + voltage + " volts.");
    }
}
