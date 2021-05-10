package nl.hr.cmtprg037.week1;

// Op6
public class Bike {
    private float speed = 0;

    private static int totalBikes = 0;  // voor iedereen hetzelfde
    private int myBikeNumber;           // alleen voor 1 object

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public Bike() {
        // nieuwe bike erbij dus verhoog total (in static var)
        totalBikes++;
        // laatste bike is deze, dus bewaar volgnummer (in instantie var)
        myBikeNumber = totalBikes;
    }

    public static void showTotalBikes() {
        System.out.println("Aantal fietsen totaal: " + totalBikes);
    }

    public void showBikeNumber() {
        System.out.println("Nummer van deze fiets: " + myBikeNumber);
    }

    public void drive(float power) {
        setSpeed(10 * power);
        System.out.println("De fiets gaat nu: " + getSpeed());
    }
}
