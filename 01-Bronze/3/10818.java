import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int num = Integer.parseInt(br.readLine());
        int[] array = new int[num];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<array.length; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
        
        Arrays.sort(array);
        bw.write(array[0] + " " + array[num-1]);
        bw.close();
    }
}
