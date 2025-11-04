public class Main {
    public static void main(String[] args) {
        // Tạo các đối tượng svien
        Student sv1 = new Student("Nguyen Van A", "123", "a@email.com");
        Student sv2 = new Student("Tran Thi B", "456", "b@email.com");
        Student sv3 = new Student("Le Van C", "789", "c@email.com");

        // Tạo các đối tượng người hướng dẫn
        Teacher gv1 = new Teacher("Pham Hoang D", "001", "d@email.com", "PGS.TS");
        Advisor hd1 = new Advisor("Do Tuan E", "e@external.com");

        // Tạo danh sách khoá luận
        ListSortable<KLTN> dsKLTN = new ListSortable<>();

        // Tạo các khoá luận và thêm vào danh sách
        KLTN<Student, Teacher> kltn1 = new KLTN<>(sv1, gv1, "Đề tài 1");
        dsKLTN.add(kltn1);

        KLTN<Student, Advisor> kltn2 = new KLTN<>(sv2, hd1, "Đề tài 2");
        dsKLTN.add(kltn2);

        KLTN<Student, Teacher> kltn3 = new KLTN<>(sv3, gv1, "Đề tài 3");
        dsKLTN.add(kltn3);

        dsKLTN.print();
    }
}
