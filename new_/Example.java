import java.util.*;

public class Example {
    public static int fact(int x){
        int fact = 1;

        while(x > 0){
            fact = fact * x;
            x = x - 1;
        }

        return fact;
    }

    public static void main(String[] args) {
        // System.out.println("Hello world !");

        Scanner input = new Scanner(System.in);

        System.out.println("Input the number : ");
        int number = input.nextInt();

        if(number >= 0){
            System.out.println("Result is "+fact(number));
        }
        else{
            System.out.println("Input number is Invalid");
        }
    }
}
