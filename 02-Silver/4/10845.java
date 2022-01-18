import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int tail = 0;

        int n = Integer.parseInt(br.readLine()); // 명령의 수
        Queue<Integer> queue = new LinkedList<>();

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken();

            if(input.equals("push")){
                int num = Integer.parseInt(st.nextToken());
                queue.offer(num);
                tail = num;
            }else if(input.equals("front")){
                if(queue.isEmpty()){
                    bw.write("-1\n");
                }else{
                    bw.write("" + queue.peek() + "\n");
                }
            }else if(input.equals("back")){
                if(queue.isEmpty()){
                    bw.write("-1\n");
                }else{
                    bw.write( "" + tail + "\n");
                }
            }else if(input.equals("size")){
                bw.write("" + queue.size() + "\n");
            }else if(input.equals("pop")){
                if(queue.isEmpty()){
                    bw.write("-1\n");
                }else{
                    bw.write("" + queue.poll() + "\n");
                }
            }else {
                if(queue.isEmpty()){
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
