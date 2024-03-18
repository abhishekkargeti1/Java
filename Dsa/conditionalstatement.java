import java.util.*;
class conditionalstatement {
    public static void main(String []args)
   {
        // Scanner sc =new Scanner(System.in);
        // int age =sc.nextInt();
        // sc.close();
        // if(age>18)
        // {
        //     System.out.println("Adult");
        // }
        // else
        // {
        //     System.out.println("Not Adult");
        // }
 
        // Scanner sc= new Scanner(System.in);
        // int a = sc.nextInt();
        // sc.close();
        // if(a%2 ==0)
        // {
        //     System.out.println("Even");
        // }
        // else
        // {
        //     System.out.println("Odd");
        // }

        // Scanner sc =new Scanner(System.in);
        // int a =sc.nextInt();
        // int b= sc.nextInt();
        // sc.close();
        // if(a ==b){
        //     System.out.println("Equal");
        // }
        // else if(a>b){
        //     System.out.println("a is greater thaa b");
        // }
        // else{
        //     System.out.println("b is greater than a");
        // }

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // sc.close();
        // if(a == 1){
        //     System.out.println("Hello");
        // }
        // else if(a == 2){
        //     System.out.println("Namaste");
        // }
        // else if(a == 3){
        //     System.out.println("Bonjour");
        // }else{
            // System.out.println("Invalid Input");
        // }



        // Scanner sc =new Scanner(System.in);
        // int a = sc.nextInt();
        // sc.close();
        // switch (a) {
        //     case 1:
        //           System.out.println("Hello");         
        //         break;
        //     case 2 :
        //         System.out.println("Namaste");    
        //         break;
        //     case 3 :
        //         System.out.println("Bonjour");
        //         break;
        //     default:
        //         System.out.println("Invalid Input");
        //         break;
        // }

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // String ch = sc.next();
        // sc.close();
        // switch (ch) {
        //     case "+":
        //     System.out.println(a+b);
        //     break;
        //     case "-":
        //     System.out.println(a-b);
        //     break;
        //     case "*":
        //     System.out.println(a*b);
        //     break;
        //     case "/":
        //     System.out.println(a/b);
        //     break;   
        //     default:
        //         System.out.println("Invalid Input");
        //         break;
        // }


        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // sc.close();
        // switch (a) {
        //     case 1:
        //     System.out.println("January");
        //     break;
        //     case 2:
        //     System.out.println("February");
        //     break;
        //     case 3:
        //     System.out.println("March");
        //     break;
        //     case 4:
        //     System.out.println("April");
        //     break;
        //     case 5:
        //     System.out.println("May");
        //     break;
        //     case 6:
        //     System.out.println("June");
        //     break;
        //     case 7:
        //     System.out.println("July");
        //     break;
        //     case 8:
        //     System.out.println("August");
        //     break;
        //     case 9:
        //     System.out.println("September");
        //     break;
        //     case 10:
        //     System.out.println("October");
        //     break;
        //     case 11:
        //     System.out.println("November");
        //     break;
        //     case 12:
        //     System.out.println("December");
        //     break;
        //     default:
        //         System.out.println("Invalid Input");
        //         break;
        // }
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        boolean isprime= true;
        for(int i=2;i<=number/2;i++)
        {
            if(number%i==0)
            {
                isprime=false;
                break;
            }
        }
        if(isprime)
        {
            if(number ==1)
            {
                System.out.println("it can be neither prime or not composite ");

            }else{
            System.out.println("Prime");
            }    
        }else
        {
            System.out.println("Not Prime");
        }

   } 
}
