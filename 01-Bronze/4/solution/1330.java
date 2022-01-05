import java.util.Scanner;

public class Main{
    public static String checkNum(int a, int b){
        String answer = "";
        if(a >= -10000 && a <= 10000 && b >= -10000 && b <= 10000){
            if(a > b){
                answer = ">";
            }else if(a < b){
                answer = "<";
            }else{
                answer = "==";
            }
        }
        return answer;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a, b;
        
        a = sc.nextInt();
        b = sc.nextInt();
        
        System.out.print(checkNum(a,b));        
    }
}
