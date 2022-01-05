import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int numCnt = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<numCnt; i++){
            int a = Integer.parseInt(st.nextToken());
            if(a < num){
                bw.write(a + " ");
            }
        }
        bw.close();
    }
}
