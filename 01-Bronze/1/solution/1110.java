import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int num = sc.nextInt();
        sc.close();
        
        int end = num;
        int cnt = 0;
        
        do{
            num = ((num % 10) * 10) + (((num / 10) + (num % 10)) % 10);
            cnt++;
        }while(num != end);
        
        System.out.println(cnt);
    }
}
