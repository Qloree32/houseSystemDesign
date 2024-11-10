package house.security;

public class SecuritySystem {
    private boolean isArmed;
    private final String systemType;

    public SecuritySystem(String systemType) {
        this.systemType = systemType;
        this.isArmed = false;
    }

    public SecuritySystem() {
        this("Standard");
    }

    public void armSystem() {
        isArmed = true;
        System.out.println("Security system armed.");
    }

    public void disarmSystem() {
        isArmed = false;
        System.out.println("Security system disarmed.");
    }

    public boolean isSystemArmed() {
        return isArmed;
    }
}
