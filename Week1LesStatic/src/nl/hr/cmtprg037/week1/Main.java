package nl.hr.cmtprg037.week1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Utils.helloWorld();

        Utils.add(1, 1);

        Utils.add("Hello", "World");

        Utils.add(1, 1, 1);

        User u = new User("Bas");
        u.login();

        User u2 = new User("Bas");
        u2.login();

        Admin a = new Admin();
        a.login();

        a.deleteDatabase();

        a.showLoggedInUsers();
        u.showLoggedInUsers();



    }
}
