package nl.hr.cmtprg037.week1;

public class Main {

    public static void main(String[] args) {
	    // Op1
        System.out.println("Hello World!");

        // Op2-5
        Utils.sayHello();

        Utils.count10();

        Utils.largerThan2(1);
        Utils.largerThan2(3);

        Utils.largerThan2("een");
        Utils.largerThan2("vier");
        Utils.largerThan2("vijf");

        // Op6-10
        Bike.showTotalBikes();

        Bike bike = new Bike();
        bike.drive(3);
        Tandem tandem = new Tandem();
        tandem.setPeople(3);
        tandem.setPeople(2);
        tandem.drive(3);
        tandem.setPeople(1);
        tandem.drive(3);

        Ebike ebike = new Ebike();
        ebike.drive(3);
        ebike.setBattery(50);
        ebike.drive(3);
        ebike.setBattery(100);
        ebike.drive(3);

        Bike.showTotalBikes();
        tandem.showBikeNumber();

    }
}
