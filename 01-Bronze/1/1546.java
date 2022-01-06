import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int max = 0;
        double sum = 0;
        double result;

        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<size; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        for(int i=0; i<arr.length; i++){
            sum += ((double)arr[i]/(double)max)*100;
        }

        result = sum/size;
        System.out.println(result);
    }
}
