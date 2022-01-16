import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }// A[N] 배열

        int M = Integer.parseInt(br.readLine());
        int[] arr2 = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<arr2.length; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }// M개의 수들

        Arrays.sort(arr); //탐색할 A[N] 정렬

        for(int i=0; i<arr2.length; i++){
            bw.write(biSearch(arr, arr2[i]) + "\n");
        }// 탐색

        bw.close();
        br.close();
    }

    public static int biSearch(int[] arr, int key){
        int lo = 0;
        int hi = arr.length -1;
        int mid;

        while(lo <= hi){
            mid = (lo + hi)/2;
            if(key == arr[mid]){
                return 1;
            }else if(key > arr[mid]){
                lo = mid+1;
            } else {
                hi = mid-1;
            }
        }
        return 0;
    }
}
