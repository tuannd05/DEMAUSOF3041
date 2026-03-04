import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SinhVienTest {
    private SinhVienService service;

    @BeforeEach
    void setUp() {
        service = new SinhVienService();
    }

    @Test
    void testThemHopLe() {
        SinhVien sv = new SinhVien("SV01","Tuấn",20,8.5f,1,"CNTT");
        service.them(sv);

        assertEquals(1, service.getList().size());
    }

    @Test
    void testThemTruongTrong() {
        SinhVien sv = new SinhVien("","Tuấn",20,8.5f,1,"CNTT");

        assertThrows(IllegalArgumentException.class, () -> {
            service.them(sv);
        });
    }

    @Test
    void testSuaHopLe() {
        SinhVien sv = new SinhVien("SV01","Tuấn",20,8.5f,1,"CNTT");
        service.them(sv);

        SinhVien svMoi = new SinhVien("SV01","Huy",20,8.5f,1,"CNTT");
        service.sua(svMoi);

        assertEquals("Huy", service.getList().get(0).getTen());
    }

    @Test
    void testSuaKhongTonTai() {
        SinhVien sv = new SinhVien("SV99","Huy",20,8.5f,1,"CNTT");

        assertThrows(RuntimeException.class, () -> {
            service.sua(sv);
        });
    }
}
