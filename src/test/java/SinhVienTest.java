import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class SinhVienTest {

    private SinhVienService service;

    @BeforeAll
    static void setupAll() {
        System.out.println("Thực thi một lần duy nhất trước tất cả các test script");
    }

    @BeforeEach
    void setUp() {
        service = new SinhVienService();
        System.out.println("Thực thi trước mỗi test script");
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
        SinhVien sv = new SinhVien("SV01","Huy",20,8.5f,1,"CNTT");
        service.them(sv);
        SinhVien svMoi = new SinhVien("SV02","Huy",20,8.5f,1,"CNTT");
        assertThrows(RuntimeException.class, () -> {
            service.sua(svMoi);
        });
    }

    @AfterEach
    void tearDown() {
        service = null;
        System.out.println("Thực thi sau mỗi lần test script");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Thực thi một lần duy nhất sau khi hoàn thành tất cả test script");
    }
}