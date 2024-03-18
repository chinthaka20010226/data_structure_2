import java.util.*;

public class Example {
    public static int fact(int x){
        if(x < 0){
            System.out.println("Input number is invalid");
            return 0;
        }
        return x;
    }

    public static void main(String[] args) {
        // System.out.println("Hello world !");

        Scanner input = new Scanner(System.in);
        System.out.println("Input the number : ");
        int number = input.nextInt();

        System.out.println("Result is "+fact(number));
    }
}
