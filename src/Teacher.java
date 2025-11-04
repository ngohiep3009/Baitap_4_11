public class Teacher {
    String fullname;
    String ID;
    String email;
    String title;

    public Teacher(String fullname, String ID, String email, String title) {
        this.fullname = fullname;
        this.ID = ID;
        this.email = email;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Teacher [Name: " + title + " " + fullname + ", ID: " + ID + "]";
    }
}