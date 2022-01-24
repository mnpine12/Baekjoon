import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack<>();
        for(int i=0; i<n; i++) {
            String str = br.readLine();
            int len = str.length();
            String[] strArr = str.split("");
            stack.push(strArr[0]);
            for(int j=1; j<strArr.length; j++){
                if(!stack.isEmpty()){
                    if(stack.peek().equals("(")){
                        if(strArr[j].equals(")")) stack.pop();
                        else stack.push(strArr[j]);
                    }else {
                        stack.push(strArr[j]);
                    }
                }else{
                    stack.push(strArr[j]);
                }
            }
            if(!stack.isEmpty()){
                bw.write("NO\n");
            }else{
                bw.write("YES\n");
            }
            stack.clear();
        }
        br.close();
        bw.close();
    }
}
