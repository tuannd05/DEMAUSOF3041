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

    public SinhVien findById(String maSV){
        for (SinhVien entity : list) {
            if (entity.getMaSV().equals(maSV)){
                return entity;
            }
        }
        throw new RuntimeException("Khong tim thay sinh vien");
    }

    public void  sua(SinhVien sv){
        validate(sv);
        for (SinhVien entity : list) {
            if (entity.getMaSV().equals(sv.getMaSV())){
                entity.setTen(sv.getTen());
                entity.setTuoi(sv.getTuoi());
                entity.setChuyenNganh(sv.getChuyenNganh());
                entity.setKyHoc(sv.getKyHoc());
                entity.setDiemTrungBinh(sv.getDiemTrungBinh());
                return;
            }
        }
        throw new RuntimeException("Khong tim thay sinh vien");
    }

    public void  validate(SinhVien sv){
        if(     sv.getMaSV() == null
                || sv.getMaSV().isBlank()
                || sv.getChuyenNganh() == null
                || sv.getChuyenNganh().isBlank()
                || sv.getDiemTrungBinh() < 0
                || sv.getDiemTrungBinh() > 10
        ){
            throw new IllegalArgumentException("MaSV khong duoc truong trong");
        }
    }
}
