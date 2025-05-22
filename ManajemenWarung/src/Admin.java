public class Admin extends User {
    public Admin(String id, String username, String password, String name) {
        super(id, username, password, name);
    }

    @Override
    public void login() {
        System.out.println("Admin " + name + " logged in.");
    }

    @Override
    public void logout() {
        System.out.println("Admin " + name + " logged out.");
    }

    public void generateReport() {
        System.out.println("Generating report...");
    }

    public void manageUsers() {
        System.out.println("Managing users...");
    }
}