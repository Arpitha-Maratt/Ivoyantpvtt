package tasks;

class User {
    private String name;
    private String email;

    // static varibale
    static int totalUser=0;

    //default constructor
    public User(){
        this.name="Arpitha";
        this.email="appi12@gmail.com";
        totalUser++;// incremented static variable
    }

    // Parameterized constructor

    public User(String name,String email){
    this.name= name;
    this.email=email;
    totalUser++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getTotalUser() {
        return totalUser;
    }

// method : showInfo()
    public void showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Email: "+ email);
        System.out.println("Total user: "+totalUser);

    }

    // overload
    public void updateEmail(String email){
        this.email=email;
    }
    public void updateEmail(String userName,String domain){
        this.email = userName + "@" + domain;
    }

}
public class Task1 {
    public static void main(String[] args) {

        User u1 = new User();
        u1.showInfo();

        User u2 = new User("Arpitha", "arpitha@gmail.com");
        u2.showInfo();

        u2.updateEmail("newemail@gmail.com");
        u2.showInfo();

        u2.updateEmail("Akshay","Backend Developer");
        u2.showInfo();

    }

}
