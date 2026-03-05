public class NhanVien {
    public int tinhTong(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Mang rong va null");
        }
        int tong = 0;
        for (int n : arr) {
            if (n < 1 || n > 1000) {
                throw new IllegalArgumentException("Giá trị phải từ 1-1000");
            }
            tong += n;
        }
        return tong;
    }
}