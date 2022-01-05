import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a, b;
        
        a = sc.nextInt();
        b = sc.nextInt();
        
        if(a > 0){
            if(b > 0){
                System.out.print("1");
            }else{
                System.out.print("4");
            }
        }else if(a < 0){
            if(b > 0){
                System.out.print("2");
            }else{
                System.out.print("3");
            }
        }
	}
}
