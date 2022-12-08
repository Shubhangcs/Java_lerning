import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        try (Scanner cd = new Scanner(System.in)) {
            float r=0;
            System.out.println("enter the number one");
            int n1=cd.nextInt();
            System.out.println("enter the operatr to perform");
            char op=cd.next().charAt(0);
            System.out.println("enter the second number ");
            int n2=cd.nextInt();
            switch(op)
            {
                case '+':r=n1+n2;
                    System.out.println(r);
                    break;
                case '-':r=n1-n2;
                    System.out.println(r);
                    break;
                case '*':r=n1*n2;
                    System.out.println(r);
                    break;
                case '/':r=(float)n1/(float)n2;
                    System.out.println(r);
                    break;
                case '%':r=n1%n2;
                    System.out.println(r);
                    break;
                default:System.out.println("Invalid operator");
            }
        }
    }
}
