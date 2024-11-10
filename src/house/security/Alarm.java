package house.security;

public class Alarm extends SecuritySystem {
    private final int alarmLevel;

    public Alarm(int alarmLevel) {
        super("Alarm");
        this.alarmLevel = alarmLevel;
    }

    public Alarm() {
        this(1);
    }

    public void triggerAlarm() {
        if (isSystemArmed()) {
            System.out.println("Alarm triggered! Level: " + alarmLevel);
        } else {
            System.out.println("Alarm not armed.");
        }
    }
}
