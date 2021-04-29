package nl.hr.cmtprg037.week1;

// basis class User
public class User {
    private String name;

    // static fields staan maar 1x in het geheugen, en worden
    // daarom gedeeld door alle instanties van de class
    // NB. Omdat ze niet bij een instantie horen, bestaan ze zelfs
    // als je geen instantie aanmaakt, maar om er dan bij te kunnen
    // zou je hem public moeten maken.
    private static int loggedIn = 0;

    public User(String n) {
        name = n;
    }

    public void login() {
        loggedIn++;
        System.out.println("Gebruiker is ingelogd");
    }

    public void showLoggedInUsers() {
        System.out.println("Aantal gebruikers ingelogd: " + loggedIn);
    }
}
