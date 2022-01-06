import java.util.*;

public class Main {
    public static int removeDuplicate(int arr[], int n){
        if (n==0 || n==1){
            return n;
        }

        int[] temp = new int[n];
        int j=0;
        for(int i=0; i<n-1; i++){
            if(arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        
        temp[j++] = arr[n-1];
        for(int i=0; i<j; i++){
            arr[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] arr2 = new int[10];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            arr2[i] = arr[i] % 42;
        }
        Arrays.sort(arr2);
        int cnt = removeDuplicate(arr2, arr2.length);
        System.out.println(cnt);
    }
}
