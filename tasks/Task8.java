package tasks;

class User3 {
    private String email;

    public User3(String email) {
        this.email = email;
    }

    public void showInfo() {
        System.out.println("Email: " + email);
    }

    // Overloaded method 1
    public void updateEmail(String email) {
        this.email = email;
        System.out.println("Email updated to: " + this.email);
    }

    // Overloaded method 2
    public void updateEmail(String username, String domain) {
        this.email = username + "@" + domain;
        System.out.println("Email updated to: " + this.email);
    }
}

// Separate top-level class
public class Task8 {
    public static void main(String[] args) {

        User3 u = new User3("arpitha@gmail.com");
        u.showInfo();

        u.updateEmail("arpitha2025@gmail.com");        // Call first version
        u.updateEmail("arpitha", "yahoo.com");        // Call second version

        u.showInfo();
    }
}
