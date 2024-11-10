package house.utilities;

public interface Utility {
    String getUtilityType();

    void operate();

    default void maintain() {
        System.out.println("Maintaining the utility.");
    }
}
