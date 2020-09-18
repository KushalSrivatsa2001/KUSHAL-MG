import java.util.Scanner;
public class fibonacci
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of terms");
        int n = sc.nextInt();
        int first = 0, second = 1, next;
        System.out.println("Fibonacci series:");
        int i = 0;
        while(i<n)
        {
            if(i<=1)
                next = i;
            else
            {
                next=first+second;
                first=second;
                second=next;
            }
            System.out.println(next);
            i++;
        }
    }
}

