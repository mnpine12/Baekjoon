import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        String sum = ""+(A*B*C);
        int size = sum.length();

        int[] arr = new int[size];
        int[] result = new int[10];

        for(int i=0; i<size; i++){
            arr[i] = Integer.parseInt(sum.substring(i,i+1));
            for(int j=0; j<10; j++){
                if(arr[i] == j){
                    result[j] += 1;
                }
            }
        }

        for(int i=0; i<10; i++){
            System.out.println(result[i]);
        }
    }
}
