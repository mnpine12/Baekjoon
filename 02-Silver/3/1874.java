import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int n = sc.nextInt();
        int point = 0;

        while(n != 0){
            int value = sc.nextInt();

            if(value > point){
                for(int i = point + 1; i<=value; i++){
                    stack.push(i);
                    sb.append('+').append('\n');
                }
                point = value;
            }else if(stack.peek() != value){
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append('-').append('\n');
            n--;
        }
        System.out.println(sb);
    }
}
