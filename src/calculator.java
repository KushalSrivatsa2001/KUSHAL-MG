import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        double a, b;
        char operator;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        a = input.nextDouble();
        b = input.nextDouble();
        System.out.println("Enter an operator (+, -, *, /):");
        operator = input.next().charAt(0);
        double output;
        switch(operator)
        {
            case '+':
                output = a + b;
                break;
            case'-':
                output = a - b;
                break;
            case '*':
                output = a * b;
                break;
            case '/':
                output = a / b;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println(a+" "+operator+" "+b+" "+output);
    }
}
