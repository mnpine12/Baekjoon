public class Main {

    public static int d(int n){
        int sum = n;

        while(n != 0){
            sum += (n%10);
            n = n/10;
        }
        return sum;
    }

    public static void main(String[] args) {

        boolean[] check = new boolean[10000];

        for(int i=0; i<check.length; i++){
            int n = d(i);

            if(d(i+1) < 10001){
                check[d(i+1)-1] = true;
            }
        }

        for(int i=0; i<check.length; i++){
            if(check[i] == false){
                System.out.println(i+1);
            }
        }
    }
}
