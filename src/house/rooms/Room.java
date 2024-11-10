package house.rooms;

public abstract class Room {
    protected int area;
    private final String roomType;

    public Room(String roomType, int area) {
        this.roomType = roomType;
        this.area = area;
    }

    public Room() {
        this("Generic Room", 100);
    }

    public abstract void cleanRoom();

    public String getRoomType() {
        return roomType;
    }
}
