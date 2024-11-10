package house;

public interface HouseOperations {
    void scheduleCleaning();

    default void manageSecurity() {
        System.out.println("Managing security for the house.");
    }
}
