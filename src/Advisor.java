public class Advisor {
    String fullname;
    String email;

    public Advisor(String fullname, String email) {
        this.fullname = fullname;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Advisor [Name: " + fullname + ", Email: " + email + "]";
    }
}