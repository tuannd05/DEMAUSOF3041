import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestJava {

    private TinhTongService tinhTongService;

    @BeforeAll
    static void setupAll() {
        System.out.println("Thực thi một lần duy nhất trước tất cả các test script");
    }

    @BeforeEach
    void setUp() {
        tinhTongService = new TinhTongService();
        System.out.println("Thực thi trước mỗi test script");
    }
    //SumTest

    @Test
    void test1_HopLe() {
        int[] arr = {1,2,3,4,5};
        assertEquals(15, tinhTongService.tinhTong(arr));
    }

    @Test
    void test2_MangRong() {
        int[] arr = {};
        assertThrows(IllegalArgumentException.class, () -> {
            tinhTongService.tinhTong(arr);
        });
    }

    @Test
    void test3_MangNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            tinhTongService.tinhTong(null);
        });
    }

    @AfterEach
    void tearDown() {
        tinhTongService = null;
        System.out.println("Thực thi sau mỗi lần test script");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Thực thi một lần duy nhất sau khi hoàn thành tất cả test script");
    }
}