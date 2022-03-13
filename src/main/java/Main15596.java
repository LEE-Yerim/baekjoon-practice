// 정수 N개의 합
public class Main15596 {
    long sum(int[] a) {
        long ans = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return ans;
    }
}
