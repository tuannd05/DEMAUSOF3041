import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    private List<SinhVien> list = new ArrayList<>();

    public void them(SinhVien sv) {
        validate(sv);
        list.add(sv);
    }

    public void sua(SinhVien sv) {
        validate(sv);

        for (SinhVien s : list) {
            if (s.getMaSV().equals(sv.getMaSV())) {
                s.setTen(sv.getTen());
                return;
            }
        }

        throw new RuntimeException("Không tìm thấy sinh viên");
    }

    private void validate(SinhVien sv) {
        if (sv.getMaSV() == null || sv.getMaSV().isEmpty()
                || sv.getTen() == null || sv.getTen().isEmpty()
                || sv.getChuyenNganh() == null || sv.getChuyenNganh().isEmpty()) {
            throw new IllegalArgumentException("Không được để trống");
        }
    }

    public List<SinhVien> getList() {
        return list;
    }
}
