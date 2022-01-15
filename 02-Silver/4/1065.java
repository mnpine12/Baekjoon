import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(hanSu(n));
        sc.close();
    }

    public static int hanSu(int n){
        int cnt = 0;
        int[] arr = new int[3];

        if(0 < n && n < 100){
            cnt = n; // 세자리수 이하는 전부 해당 입력값으로 한수 개수
        } else if(n == 1000){
            cnt = 144; // 4자리수 한수
        } else {
            cnt = 99; // 3자리수 한수 최소값
            for(int i=100; i<=n; i++){ // 3자리수 100부터 입력된 값까지 한수 개수 세기
                arr[0] = (i%1000)/100;
                arr[1] = (i%100)/10;
                arr[2] = (i%10)/1;
                if(arr[0] - arr[1] == arr[1] - arr[2]) {
                    cnt++; // 한수 증가
                }
            }
        }
        return cnt;
    }
}
