import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Function You Want to Calculate");
        char funct = sc.next().charAt(0);
        System.out.println("Enter 1st Number");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd Number");
        int n2 = sc.nextInt();
        switch (funct) {
            case '+':
                System.out.println(n1 + n2);
                break;
            case '-':
                System.out.println(n1 - n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            case '/':
                System.out.println(n1 / n2);
                break;
            case '%':
                System.out.println(n1 % n2);
                break;
            default:
            System.out.println("You Enter Wrong Function");
                break;
        }
    }
}
