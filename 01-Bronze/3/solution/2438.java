import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num; i++){
            for(int j=0; j<=i; j++){
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.close();
    }
}
