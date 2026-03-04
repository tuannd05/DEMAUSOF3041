import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TinhTongTest {

    private TinhTongN tinhTongN;

    @BeforeAll
    static void setupAll() {
        System.out.println("Thực thi một lần duy nhất trước tất cả các test script");
    }
    //Thực thi trước mỗi lần test script
    @BeforeEach
    void setUp() {
        //Khởi tạo đối tượng Calculator
        tinhTongN = new TinhTongN();
        System.out.println("Thực thi trước mỗi test script");
    }
    // ===== 5 TEST PASS =====

    @Test
    void test1_HopLe() {
        assertEquals(15, tinhTongN.tinhTong(new int[]{1,2,3,4,5}));
    }

    @Test
    void test2_MangRong() {
        assertEquals(0, tinhTongN.tinhTong(new int[]{}));
    }

    @Test
    void test3_SoAm() {
        assertEquals(-6, tinhTongN.tinhTong(new int[]{-1,-2,-3}));
    }

    @Test
    void test4_SoLon() {
        assertEquals(3000000, tinhTongN.tinhTong(new int[]{1000000,2000000}));
    }

    @Test
    void test5_MotPhanTu() {
        assertEquals(7, tinhTongN.tinhTong(new int[]{7}));
    }

    // ===== 2 TEST FAIL =====

    @Test
    void test6_SaiExpected() {
        // 1+2+3 = 6 nhưng cố tình expected sai
        assertEquals(10, tinhTongN.tinhTong(new int[]{1,2,3}));
    }

    @Test
    void test7_KhongNémException() {
        // Code của bạn có ném exception
        // Nhưng ta cố tình test sai để fail
        assertDoesNotThrow(() -> {
            tinhTongN.tinhTong(null);
        });
    }
    @AfterEach
    void tearDown() {
        tinhTongN = null;
        System.out.println("Thực thi sau mỗi lần test script");
    }
    //Thực thi một lần duy nhất sau khi hoàn thành tất cả các test script
    @AfterAll
    static void tearDownAll(){
        System.out.println("Thực thi một lần duy nhất sau khi hoàn thành tất cả test script");
    }
}