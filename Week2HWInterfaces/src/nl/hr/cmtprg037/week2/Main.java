package nl.hr.cmtprg037.week2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Car c = new Car();
        c.setSpeed(120);
        vehicles.add(c);

        Bus b = new Bus();
        b.setSpeed(50);
        vehicles.add(b);

	    Bike b2 = new Bike();
	    b2.setSpeed(18);
	    vehicles.add(b2);

        System.out.println("Lijst voor sorteren");

	    // methode met teller
//        for(int i = 0; i < vehicles.size(); i++) {
//            vehicles.get(i).drive();
//        }

        // methode met iterator (for of, in typescript)
	    for(Vehicle v : vehicles) {
	        v.drive();
        }

        System.out.println("Lijst na sorteren");
//	    // sort alleen mogelijk als vehicles comparable zijn
	    Collections.sort(vehicles);
	    
        for(Vehicle v : vehicles) {
            v.drive();
        }
    }
}
