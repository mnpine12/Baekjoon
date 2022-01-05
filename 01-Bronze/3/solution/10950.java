import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int l, a, b;
        
        l = sc.nextInt();
        
        for(int i=0; i<l; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a+b);
        }
        sc.close();
	}
}
