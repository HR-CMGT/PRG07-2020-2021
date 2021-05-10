package nl.hr.cmtprg037.week2;

public abstract class Animal {
    private float weight;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void showWeight() {
        System.out.println("Ik weeg: " + weight);
    }

    public abstract void makeSound();

    public void walk() {
        System.out.println("Ik loop.");
    }
}
