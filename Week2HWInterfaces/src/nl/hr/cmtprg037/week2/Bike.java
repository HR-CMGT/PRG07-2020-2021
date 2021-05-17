package nl.hr.cmtprg037.week2;

public class Bike extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Tring, ik ben een fiets en ik rijd " + getSpeed());
    }
}
