package nl.hr.cmtprg037.week1;

public class Ebike extends Bike {
    private float battery;

    public float getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    // ebike gaat harder als de battery is opgeladen
    // 2x zo hard als battery 100% is, net zo hard als battery 0% is
    public void drive(float power) {
        super.drive(power + (battery / 100) * power);
    }
}
