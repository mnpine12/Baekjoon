import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 명령어 개수
        String[] A = new String[n];

        for(int i=0; i<n; i++){
            A[i] = br.readLine();
        }

        List<String> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(!list.contains(A[i]))
                list.add(A[i]);
        }// 중복값 제거

        Collections.sort(list, new Comparator<String>() { //리스트 정렬
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){ // 같은 길이의 글자면 사전순으로 정렬
                    for(int i=0; i<o1.length(); i++){
                        if((int)o1.charAt(i) != (int)o2.charAt(i)){
                            return (int)o1.charAt(i) - (int)o2.charAt(i); // 각 글자 유니코드 값 비교
                        }
                    }
                }
                return o1.length() - o2.length(); 
            }
        });

        for(String s : list) {
            System.out.println(s); //출력
        }
        br.close();
    }
}
