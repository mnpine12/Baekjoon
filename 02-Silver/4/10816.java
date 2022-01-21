import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arrN = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arrN); //정렬 한번 해주기

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int M = Integer.parseInt(st.nextToken());
            bw.write(upperBound(arrN, M) - lowerBound(arrN, M) + " ");
        }
        br.close();
        bw.close();
    }

    public static int lowerBound(int[] arr, int key){
        int lo = 0;
        int hi = arr.length;
        int mid;

        while(lo < hi){
            mid = lo + (hi-lo)/2;
            if(key <= arr[mid]){
                hi = mid;
            }else {
                lo = mid+1;
            }
        }
        return lo;
    }

    public static int upperBound(int[] arr, int key){
        int lo = 0;
        int hi = arr.length;
        int mid;

        while(lo < hi){
            mid = lo + (hi-lo)/2;
            if(key < arr[mid]){
                hi = mid;
            }else {
                lo = mid+1;
            }
        }
        return lo;
    }
}
