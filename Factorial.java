public class Factorial {
    public static void main(String[] args) {
        
        int yourNum = 4;
        int a = factorialRecursion(yourNum);
        System.out.println("The factorial of: " + yourNum + " is " + a);
    }

    public static int factorialRecursion(int b){

        int x = b;

        for (int i = (b-1); i >= 1 ; i--){
            x = x * i;
        }

        return x;
    }
}
