import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()); // 명령의 수
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken();

            if(input.equals("push_front")){
                int num = Integer.parseInt(st.nextToken());
                deque.offerFirst(num);
            }else if(input.equals("push_back")){
                int num = Integer.parseInt(st.nextToken());
                deque.offerLast(num);
            }else if(input.equals("pop_front")){
                if(deque.isEmpty()){
                    bw.write("-1\n");
                }else{
                    bw.write("" + deque.pollFirst() + "\n");
                }
            }else if(input.equals("pop_back")){
                if(deque.isEmpty()){
                    bw.write("-1\n");
                }else{
                    bw.write("" + deque.pollLast() + "\n");
                }
            }else if(input.equals("size")){
                bw.write("" + deque.size() + "\n");
            }else if(input.equals("front")){
                if(deque.isEmpty()){
                    bw.write("-1\n");
                }else{
                    bw.write("" + deque.getFirst() + "\n");
                }
            }else if(input.equals("back")){
                if(deque.isEmpty()){
                    bw.write("-1\n");
                }else{
                    bw.write("" + deque.getLast() + "\n");
                }
            }else {
                if(deque.isEmpty()){
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
