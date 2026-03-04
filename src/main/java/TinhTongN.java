public class TinhTongN {
    public int tinhTong(int[] arr){
        if(arr == null){
            throw new IllegalArgumentException("Mang khong duocc null");
        }
        int sum = 0;
        for(int n : arr){
            sum += n;
        }
        return sum;
    }
}