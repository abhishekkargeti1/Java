import java.util.*;
public class function {
    public static void printMyName(String name){
        System.out.println(name);
        // all function store in memory in stack form .
    }
    public static int addition(int a,int b){
        int sum = a+b;
        return sum;
    }
    public static int multiple(int a,int b){
        int multiple=a*b;
        return multiple;
    }
    public static int divide(int a,int b){
        int divide=a/b;
        return divide;
    }
    public static int subtract(int a,int b){
        int subtract =a-b;
        return subtract;
    }
    public static int factorial (int a){
        int fact=1;
        for(int i=0;i<a;i++)
        {
            fact=fact*(a-i);
        }
        return fact;
    }

    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        // String name=sc.next();
        System.out.println("Enter number 1 :");
        int number1= sc.nextInt();
        System.out.println("Enter a number 2:");
        int number2= sc.nextInt();
        sc.close();
        // printMyName(name);
        int sum = addition(number1, number2);
        int multiple= multiple(number1, number2);
        int divide= divide(number1, number2);
        int subtract=subtract(number1,number2);
        int fact=factorial(number1);
        System.out.println(sum);
        System.out.println(multiple);
        System.out.println(divide);
        System.out.println(subtract);
        System.out.println(fact);
    }
}
