import java.util.Scanner;

public class factorial
{
    public static void main(String[] args) {
        int num;
        Scanner value = new Scanner(System.in);
        System.out.println("Enter a number");
        num = value.nextInt();
        long fact = 1;
        for(int i = 1;i <=num; i++){
            fact=fact*i;
        }

        System.out.println("Factorial of the "+num+" is :"+fact);
    }
}

