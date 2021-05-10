package nl.hr.cmtprg037.week2;

public class Fish extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Blub");
    }

    @Override
    public void walk() {
        System.out.println("Vissen kunnen niet lopen.");
    }

    public void swim() {
        System.out.println("Ik zwem");
    }
}
