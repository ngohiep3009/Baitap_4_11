public class Student {
    String fullname;
    String ID;
    String email;

    public Student(String fullname, String ID, String email) {
        this.fullname = fullname;
        this.ID = ID;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student [Name: " + fullname + ", ID: " + ID + "]";
    }
}