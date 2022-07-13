public class Floors implements Comparable<Floors> {
    private int floors;
    private int priority;


    public Floors(int floors, int priority) {
        this.floors = floors;
        this.priority = priority;
    }

    public int getFloors() {
        return floors;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return String.format(
                "Этаж:%s ->",
                floors
        );
    }

    @Override
    public int compareTo(Floors floors) {
        return this.floors - floors.priority;
    }
}