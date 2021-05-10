package nl.hr.cmtprg037.week1;

public class Tandem extends Bike {
    private int people;

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        if ((people >= 0) && (people <= 2)) {
            this.people = people;
        } else {
            System.out.println("Er kunnen 0, 1 of 2 mensen op een tandem.");
        }
    }

    // tandem gaat harder als er meer mensen op zitten
    public void drive(float power) {
        super.drive(power * people);
    }
}
