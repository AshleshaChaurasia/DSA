import java.util.*;

public class calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        double a = sc.nextDouble();
        System.out.println("Enter second nnumber");
        double b = sc.nextDouble();
        System.out.println("Enter the operation you want to perform(+,-,*,/,%)");
        char op = sc.next().charAt(0);
        switch(op){
            case '+': System.out.println(a+b);
                        break;
            case '-': System.out.println(a-b);
                        break;
            case '*': System.out.println(a*b);
                        break;
            case '/': System.out.println(a/b);
                        break;
            case '%': System.out.println(a%b);
                        break;
            default: System.out.println("Wrong operator");
        }
    }
}