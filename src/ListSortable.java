import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortable<E> {
    List<E> danhSach;

    public ListSortable() {
        this.danhSach = new ArrayList<>();
    }

    public void add(E element) {
        this.danhSach.add(element);
    }

    public void print() {
        try {
            Collections.sort(this.danhSach, new Comparator<E>() {
                @Override
                public int compare(E obj1, E obj2) {
                    KLTN kltn1 = (KLTN) obj1;
                    KLTN kltn2 = (KLTN) obj2;

                    String ten1 = kltn1.getTenKhoaLuan();
                    String ten2 = kltn2.getTenKhoaLuan();

                    return ten1.compareTo(ten2);
                }
            });

        } catch (ClassCastException e) {
            System.err.println("Lỗi: Danh sách này chứa đối tượng không phải KLTN!");
        }

        for (E item : this.danhSach) {
            System.out.println(item);
        }
    }
}