public class Fib {
    public static int fib(int n) {
        int x = 0;
        int y = 1;
        int z;
        if(n >= 3){
        for (int i = 0; i < n-2; i++ ){
            z = x + y;
            x = y;
            y = z;

        }
        }
        return y;
    }
    public static void main(String[] args) {
        System.out.println(fib(9));
    }

}

