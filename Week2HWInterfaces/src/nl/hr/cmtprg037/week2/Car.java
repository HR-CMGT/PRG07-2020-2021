package nl.hr.cmtprg037.week2;

public class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Broem, ik ben een auto en ik rijd " + getSpeed());
    }
}
