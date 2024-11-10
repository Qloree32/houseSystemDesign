package house;

public abstract class Resident {
    private String name;
    protected int age;

    public Resident(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Resident() {
        this("Unknown", 0);
    }

    public abstract void dailyRoutine();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
