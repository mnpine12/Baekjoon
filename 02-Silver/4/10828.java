import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()); // 명령의 수
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken();

            if(input.equals("push")){
                int num = Integer.parseInt(st.nextToken());
                stack.push(num);
            }else if(input.equals("top")){
                if(stack.empty()){
                    bw.write("-1\n");
                }else{
                    bw.write("" + stack.peek() + "\n");
                }
            }else if(input.equals("size")){
                bw.write("" + stack.size() + "\n");
            }else if(input.equals("pop")){
                if(stack.empty()){
                    bw.write("-1\n");
                }else{
                    bw.write("" + stack.pop() + "\n");
                }
            }else {
                if(stack.empty()){
                    bw.write("1\n");
                }else{
                    bw.write("0\n");
                }
            }
        }
        br.close();
        bw.close();
    }
}
