package nl.hr.cmtprg037.week1;

public class Utils {
    // static methods worden vaak gebruikt voor functies in een
    // object georienteerde programmeertaal

    public static void helloWorld() {
        System.out.println("Hello World");
    }

    // overloading voorbeelden
    public static void add(int a, int b) {
        int result = a + b;
        System.out.println("Twee getallen bij elkaar zijn: " + result);
    }

    public static void add(int a, int b, int c) {
        int result = a + b + c;
        System.out.println("Drie getallen bij elkaar zijn: " + result);
    }

    public static void add(String s1, String s2) {
        String result = s1 + s2; // Concat
        System.out.println("Twee woorden aan elkaar zijn: " + result);
    }
}
