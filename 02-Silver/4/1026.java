import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int sum = 0;

        int n = Integer.parseInt(br.readLine()); // 명령어 개수
        int[] A = new int[n];
        Integer[] B = new Integer[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            A[i] = Integer.parseInt(st.nextToken());
        } // A 배열
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            B[i] = Integer.parseInt(st.nextToken());
        } // B 배열

        Arrays.sort(A); // A배열 정렬
        Arrays.sort(B,Collections.reverseOrder());

        for(int i=0; i<n; i++){
            sum += A[i] * B[i];
        }

        System.out.println(sum);
        br.close();
    }
}
