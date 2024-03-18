// public class patterns {
//     public static void main(String[] args) {
//         //Rectangle

//         for(int i= 1;i<=4;i++) {
//             for(int j=1;j<=5;j++){
//                 System.out.print("*");
//             }
//             System.out.println();        
//         }

//             outer rectangle

//         for(int i=1; i<=4;i++) {
//             for(int j=1;j<=5;j++)
//             if(i==1||j==1||i==4||j==5){
//                 System.out.print("*");
//             }else{
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }

//             half pyramid

//         for(int i=1;i<=4;i++)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }

//         bottom to up half pyramid
//         for(int i=4;i>=1;i--)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }

//         right hand side half pyramid
//         for(int i=1;i<=4;i++ )
//         {
//             for(int j=1;j<=4-i;j++)
//             {
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++)
//             {
//                    System.out.print("*"); 

//             }
        
//             System.out.println(" ");
//         }

//         bottom to up right side half pyramid

//         for(int i=4;i>=1;i--)
//         {
//             for(int j=4-i;j>=1;j--)
//             {
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println(" ");

//         }

//         number in right half pyramid

//         for(int i=1;i<=5;i++)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print(j);
//             }
//             System.out.println(" ");
                
//         }

//         number in inverted form  in half pyramid
//         for(int i=5;i>=1;i--)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print(j);
//             }
//             System.out.println(" ");
//         }

//         Floyd's Triangle
//         int counter =1;
//         for(int i=1;i<=5;i++)
//          {
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print(counter+" ");
//                 counter++;
//             }
//             System.out.println(" ");
//          } 
        
//         0 1 triangle

//         for(int i=1;i<=5;i++)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                  int counter =i+j;
//                 if(counter%2==0){
//                     System.out.print("1"+" ");
//                 }else{
//                     System.out.print("0"+" ");
//                 }
//             }
//             System.out.println(" ");
//          }   

         
//         for(int i =1; i<=5;i++){
//                 for(int j=5-i;j>0;j--){
//                     System.out.print("  ");
//                 }
//                 for(int j=1;j<=i;j++){
//                     System.out.print(j+" ");
//                 }
//                 for(int j=i-1;j>=1;j--){
//                     System.out.print(j+" ");
//                 }         
//                 System.out.println(" ");
//             }

//     }
// }
