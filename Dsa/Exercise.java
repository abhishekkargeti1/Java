// import java.util.*;
// public class Exercise {
//     public static float average(int a,int b,int c){
    
//         float average= (a+b+c) / 3.0f;
//         return average;
//     }
//     public static int sumofoddnumber(int n){
//         int sum=0;
//         for(int i=1;i<=n;i++){
//             if(i%2!=0){
//                 sum += i;
//             }
//         }
//         return sum;
//     }
//     public static int greaternumber(int a,int b){
//         if(a>b){
//             return a;
//         }else{
//             return b;
//         }

//     }
//     public static float circumferance(float a){
//         float r=a;
//         float circumferance= 2*3.14f*r;
//         return circumferance;
//     }
//     public static void votesystem(int age){
//         if(age>=18){
//             System.out.println("eligible to vote");
//         }else{
//             System.out.println("Not eligible to vote");
//         }
//     }
    // public static void numbercount(){
    //     int positiveCount=0,negativeCount=0,zeroCount=0;
    //     Scanner sc=new Scanner(System.in);
    //     int number;
    //     for(int i=1;i<=10;i++){
    //         number =sc.nextInt();
    //     if(number>0){
    //         positiveCount++;
    //     }else if(number<0){
    //         negativeCount++;
    //     }else{
    //         zeroCount++;
    //     }   
    // } 
//         System.out.println(positiveCount);
//         System.out.println(negativeCount);
//         System.out.println(zeroCount);    
//     }
//     public static double power(int x,int n){
//         double power=Math.pow(x , n);
//         return power;
//     }
//     public static int fibo(int n){
//         int a=0,b=1,c=0;
//         if(n == 0){
//             return 1;
//         }
//         if (n == 1) {
//             return 2;
//         }
//         for(int i=0;i<=n-2;i++){
//             c=a+b;
//             a=b;
//             b=c;
//             System.out.println(c);
//         }
//         return c;
//     }


//     public static void main(String []args){
//         float average=average(2, 3, 5);
//         System.out.println(average);
//         int sum= sumofoddnumber(10);
//         System.out.println(sum);
//         int greaternumber= greaternumber(20, 30);
//         System.out.println(greaternumber);
//         float circumferance= circumferance(25.0f);
//         System.out.println(circumferance);
//         votesystem(20);
//         numbercount();
//         double power=power(2,2);
//         System.out.println(power);
//         // int fibo= fibo(10);
        

//     }
// }
