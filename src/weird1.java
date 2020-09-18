import java.util.Scanner;

public class weird1 {

    public static void main(String[] args) {
        int n;
        System.out.println("ENter an integer value");
        Scanner value = new Scanner(System.in);
        n = value.nextInt();
        if (n % 2 == 0) {
            if (n >= 2 && n <= 5)
            {
                System.out.println("The number is not wierd");
            }
            else if (n >= 6 && n <= 20) {
                System.out.println("The number is weird");
            } else if (n > 20) {
                System.out.println("The number is not weird");
            }
        } else {
            System.out.println("The number is weird");
        }
    }
}
