package house.rooms;

public class Bedroom extends Room {
    private boolean hasAttachedBathroom;

    public Bedroom(int area, boolean hasAttachedBathroom) {
        super("Bedroom", area);
        this.hasAttachedBathroom = hasAttachedBathroom;
    }

    public Bedroom() {
        super();
        this.hasAttachedBathroom = false;
    }

    @Override
    public void cleanRoom() {
        System.out.println("Cleaning the bedroom");
    }

    public void sleep() {
        System.out.println("Sleeping in the bedroom.");
    }
}
