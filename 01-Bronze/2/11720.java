import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        String str = sc.next();
        int[] arr = new int[str.length()];
        int sum = 0;

        for(int i=0; i<str.length(); i++){
            arr[i] = str.charAt(i) - '0';
        }

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }

        System.out.println(sum);

    }
}
