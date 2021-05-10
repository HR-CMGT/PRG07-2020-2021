package nl.hr.cmtprg037.week1;

public class Utils {
    // Op2
    public static void sayHello() {
        System.out.println("Hello World!");
    }

    // Op3
    public static void count10() {
        for(int i = 1; i < 11; i ++) {
            System.out.println("Count: " + i);
        }
    }

    // Op4
    public static void largerThan2(int i) {
        if (i > 2) {
            System.out.println("Dit getal is groter dan 2");
        } else {
            System.out.println("Dit getal is NIET groter dan 2");
        }
    }

    // Op5
    public static void largerThan2(String s) {
        if (s.equals("een")) {
            largerThan2(1);
        } else {
            if (s.equals("twee")) {
                largerThan2(2);
            } else {
                if (s.equals("drie")) {
                    largerThan2(3);
                } else {
                    if (s.equals("vier")) {
                        largerThan2(4);
                    } else {
                        System.out.println("Dit getal ken ik niet");
                    }
                }
            }
        }
    }
}
