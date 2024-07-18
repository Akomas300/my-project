package Java_Projets.Day7;

public class LoginSystem {
    Reverse obj1 = new Reverse();
    private String hashedPassword = "";

    public LoginSystem(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public static void main(String[] args) {
        var obj2 = new LoginSystem("");
        System.out.println(obj2.setPassword());
        System.out.println(obj2.setPassword().equals(obj2.checkPassword("Mathias")));
        //System.out.println(obj.setPassword().equals(obj.checkPassword("mathias")));
        System.out.println("****************************************************");
        var obj = new LoginSystem("");
        System.out.println(obj.setPassword().equals(obj.checkPassword("Mathoas")));

    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public String setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
        return hashedPassword;
    }

    public String setPassword() {
        return obj1.reverseMessage(setHashedPassword("Mathias"));

    }

    public void message() {
        System.out.println("the password is: " + getHashedPassword());
    }

    public String checkPassword(String password) {
        return obj1.reverseMessage(password);
    }
}
