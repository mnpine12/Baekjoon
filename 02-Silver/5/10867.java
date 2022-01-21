import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(!list.contains(a)){
                list.add(a);
            }
        }
        Collections.sort(list);
        for(int i : list){
            System.out.print(i + " ");
        }
    }
}
