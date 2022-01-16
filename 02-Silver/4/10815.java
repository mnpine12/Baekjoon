import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()); // 상근이가 가지고 있는 숫자 카드의 개수
        long[] arrN = new long[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine()); // 상근이가 가지고 있는 숫자 카드의 개수
        long[] arrM = new long[m];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            arrM[i] = Integer.parseInt(st.nextToken());
        }

        br.close();
        Arrays.sort(arrN); // 상근이 숫자 카드 정렬

        for(int i=0; i<m; i++){
            bw.write(cardSearch(arrN, arrM[i]) + " ");
        }
        bw.close();
    }

    public static int cardSearch(long[] arr, long num){
        int end = arr.length - 1;
        int start = 0;
        int mid;

        while(start <= end){
            mid = (end + start) / 2;
            if(num == arr[mid]){
                return 1;
            }else if(num > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return 0;
    }
}
