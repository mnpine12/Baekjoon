import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A,B,C,answer;
        
        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();
        
        checkNum(A);
        checkNum(B);
        checkNum(C);
        
        if(checkNum(A) == true && checkNum(B) == true && checkNum(C) == true){
            answer = (A+B)%C;
            System.out.println(answer);
            answer = ((A%C)+(B%C))%C;
            System.out.println(answer);
            answer = (A*B)%C;
            System.out.println(answer);
            answer = ((A%C)*(B%C))%C;
            System.out.println(answer);
        }
    }
    
    public static boolean checkNum(int num){
        if(2 <= num && num <= 10000){
            return true;
        }
        return false;
    }
}
