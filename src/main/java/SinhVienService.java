import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    private List<SinhVien> list = new ArrayList<>();

    public List<SinhVien> getList() {
        return list;
    }

    public void them(SinhVien sv){
        validate(sv);
        list.add(sv);
    }

    public void  sua(SinhVien sv){
        validate(sv);
        for (SinhVien sinhVien : list) {
            if (sinhVien.getMaSV().equals(sv.getMaSV())){
                sinhVien.setTen(sv.getTen());
                sinhVien.setTuoi(sv.getTuoi());
                sinhVien.setChuyenNganh(sv.getChuyenNganh());
                sinhVien.setKyHoc(sv.getKyHoc());
                sinhVien.setDiemTrungBinh(sv.getDiemTrungBinh());
                return;
            }
        }
        throw new RuntimeException("Khong tim thay sinh vien");
    }
    public void xoa(String maSV){
        list.removeIf(sv -> sv.getMaSV().equals(maSV));
    }

    public void  validate(SinhVien sv){
        if(     sv.getMaSV() == null
                || sv.getMaSV().isBlank()
                || sv.getChuyenNganh() == null
                || sv.getChuyenNganh().isBlank()){
            throw new IllegalArgumentException("MaSV khong duoc truong trong");
        }
    }
}
