import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String str = br.readLine(); // 편집기에 입력되어 있는 문자열
        int m = Integer.parseInt(br.readLine()); // 명령어 개수
        Stack<String> stackL = new Stack<>();
        Stack<String> stackR = new Stack<>();

        for(int i=0; i<str.length(); i++){
            stackL.push(str.charAt(i) + "");
        }// 스택l 에 문자열 저장

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken();

            switch (input){
                case "L" :
                    if(!stackL.isEmpty())
                        stackR.push(stackL.pop());
                    break;
                case "D" :
                    if(!stackR.isEmpty())
                        stackL.push(stackR.pop());
                    break;
                case "B" :
                    if(!stackL.isEmpty())
                        stackL.pop();
                    break;
                case "P" :
                    String input2 = st.nextToken();
                    stackL.push(input2);
                    break;
            }
        }

        while(!stackL.isEmpty()){
            stackR.push(stackL.pop());
        }

        while (!stackR.isEmpty()){
            bw.write(stackR.pop());
        }

        br.close();
        bw.close();
    }
}
