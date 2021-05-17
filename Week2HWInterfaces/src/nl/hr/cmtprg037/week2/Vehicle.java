package nl.hr.cmtprg037.week2;

public abstract class Vehicle implements Comparable<Vehicle> {
    private float speed = 0;

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public abstract void drive();

    @Override
    public int compareTo(Vehicle other) {
        // +1 deze groter, 0 gelijk, -1 de andere is groter
        if (this.getSpeed() > other.getSpeed()) {
            return 1;
        } else if (other.getSpeed() > this.getSpeed()) {
            return -1;
        } else {
            return 0;
        }
    }
}
