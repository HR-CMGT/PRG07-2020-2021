package nl.hr.cmtprg037.week2;

public class Bus extends Vehicle {
    @Override
    public void drive() {
        System.out.println("BROEM, ik ben een bus en ik rijd " + getSpeed());
    }
}
