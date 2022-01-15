import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int len = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        ArrayList<Pair> list = new ArrayList<>();
        int[] A = new int[len];

        /*
         * 예시)
         * 입력 값 : 2 1 3 1
         * */
        for(int i=0; i<len; i++){
            int num = Integer.parseInt(st.nextToken());
            Pair p = new Pair(i, num);
            list.add(p);
        }
        /*
         * for문 실행 후
         * list 에 들어가 있는 값 현황
         * key : [0 1 2 3] <- 최초 입력된 값의 인덱스
         * val : [2 1 3 1] <- 최초 입력된 값
         * */

        Collections.sort(list, new Comparator<Pair>() {

            @Override
            public int compare(Pair o1, Pair o2) { // 값으로 정렬
                if(o1.val < o2.val){
                    return -1;
                }else if(o1.val > o2.val){
                    return 1;
                }else{
                    if(o1.key < o2.key){ // 인덱스로 한번 더 정렬
                        return -1;
                    }else{
                        return 0;
                    }
                }
            }
        }); //val순으로 비내림차순 정렬 오버라이딩
        /*
         * sort 실행 후
         * list 에 들어가 있는 값 현황
         * val : [1 1 2 3] <- 입력된 값의 비내림차순 정렬
         * key : [1 3 0 2] <- 최초 입력된 값의 인덱스
         * */

        for(int i=0; i<len; i++){
            A[list.get(i).getKey()] = i;
        }
        /*
         * for문 실행
         * list 에 들어가 있는 값 현황
         * val : [1 1 2 3] <- 입력된 값의 비내림차순 정렬
         * key : [1 3 0 2] <- 최초 입력된 값의 인덱스 값
         * key를 배열의 인덱스로 사용하고 현재 정렬되어 있는 리스트의 인덱스 상태 = [0 1 2 3] 을 값으로 배열에 저장한다.
         * key : [1 3 0 2]
         * idx : [0 1 2 3] <- 현재 리스트의 인덱스 상태
         * for문을 실행하게 될 경우의 출력
         * A[1] = 0
         * A[3] = 1
         * A[0] = 2
         * A[2] = 3
         * */

        for(int i : A){
            bw.write(i + " ");
        }
        /*
         * for-each문 실행
         * 배열 A에 들어가 있는 값을 순서대로 출력
         * A[0] = 2
         * A[1] = 0
         * A[2] = 3
         * A[3] = 1
         * 출력 값 : 2 0 3 1
         * */
        bw.close();
    }
}

class Pair <Pair>{
    Integer key;
    Integer val;

    public Pair(Integer key, Integer val){
        this.key = key;
        this.val = val;
    }
    public Integer getKey(){
        return key;
    }
    public Integer getVal(){
        return val;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", val=" + val +
                '}';
    }// 출력 확인용
}
