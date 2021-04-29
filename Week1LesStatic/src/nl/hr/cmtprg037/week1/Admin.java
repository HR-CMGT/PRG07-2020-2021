package nl.hr.cmtprg037.week1;

// uitbreiding op de class User
public class Admin extends User {
    public Admin() {
        super("admin");
    }

    // vervangt login uit User
    public void login() {
        // maar roept wel eerst de login yut User aan
        super.login();

        System.out.println("Admin rechten toegevoegd");
    }

    // deze method bestaat alleen in Admin, niet in User
    public void deleteDatabase() {
        System.out.println("Db deleted");
    }
}
