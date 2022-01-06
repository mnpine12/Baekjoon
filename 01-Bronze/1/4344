import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int[] arr;
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            arr = new int[N];

            double sum = 0;

            for(int j=0; j<N; j++){
                int val = Integer.parseInt(st.nextToken());
                arr[j] = val;
                sum += val;
            }
            
            double avg = (sum/N);
            double count = 0;

            for(int j=0; j<N; j++){
                if(arr[j] > avg){
                    count++;
                }
            }
            System.out.printf("%.3f%%\n", (count/N)*100);
        }
    }
}
