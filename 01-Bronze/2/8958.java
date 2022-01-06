import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int countOX(String str){
        int cnt = 0;
        int sum = 0;
        int len = str.length();
        char check = str.charAt(0);

        if(check == 'O'){
            cnt = 1;
        }else{
            cnt = 0;
        }

        sum = cnt;
        for(int i=1; i<len; i++){
            if(str.charAt(i) == 'O' && check == 'O'){
                cnt += 1;
            }else if(str.charAt(i) == 'O' && check == 'X'){
                cnt = 1;
            }else{
                cnt = 0;
            }
            check = str.charAt(i);
            sum += cnt;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String str = "";

        int size = Integer.parseInt(br.readLine());

        for(int i=0; i<size; i++){
            str = br.readLine();
            int score = countOX(str);
            bw.write(score + "\n");
        }
        br.close();
        bw.close();
    }
}
