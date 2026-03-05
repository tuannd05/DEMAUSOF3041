import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestJava {

    private TinhTongN tinhTongN;

    @BeforeAll
    static void setupAll() {
        System.out.println("Thực thi một lần duy nhất trước tất cả các test script");
    }

    @BeforeEach
    void setUp() {
        tinhTongN = new TinhTongN();
        System.out.println("Thực thi trước mỗi test script");
    }
    //SumTest

    @Test
    void test1_HopLe() {
        int[] arr = {1,2,3,4,5};
        assertEquals(15, tinhTongN.tinhTong(arr));
    }

    @Test
    void test2_MangRong() {
        int[] arr = {};
        assertThrows(IllegalArgumentException.class, () -> {
            tinhTongN.tinhTong(arr);
        });
    }

    @Test
    void test3_MangNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            tinhTongN.tinhTong(null);
        });
    }

    @AfterEach
    void tearDown() {
        tinhTongN = null;
        System.out.println("Thực thi sau mỗi lần test script");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Thực thi một lần duy nhất sau khi hoàn thành tất cả test script");
    }
}