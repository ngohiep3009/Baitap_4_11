public class KLTN<T, V> {
    T student;
    V supervisor;
    String tenKhoaLuan;

    public KLTN(T student, V supervisor, String tenKhoaLuan) {
        this.student = student;
        this.supervisor = supervisor;
        this.tenKhoaLuan = tenKhoaLuan;
    }

    public String getTenKhoaLuan() {
        return tenKhoaLuan;
    }

    @Override
    public String toString() {
        return "KLTN: " + tenKhoaLuan + "\n" +
                "  SV: " + student.toString() + "\n" +
                "  HD: " + supervisor.toString();
    }
}