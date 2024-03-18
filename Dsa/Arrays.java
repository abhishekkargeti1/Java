// import java.util.Arrays.*;
// import java.util.Arrays;
import java.util.Collections;
public class Arrays {
    public static void main(String []args){
        // type[]arrayName=new type[]; syntax
        // type arrayName[]=new type[]; syntax
        // type arrayName[]={97,,98,72}; syntax
        // start form zero index



        // Example

        // int marks[]=new int[3];
        // marks[0]=90;
        // marks[1]=92;
        // marks[2]=72;    
        // int marks1[]={97,98,72};
        // for(int i=0;i<marks.length;i++){
        //     System.out.println(marks[i]);
        // }
        // System.out.println(marks[2]);

            
        // Scanner sc=new Scanner(System.in);
        // int size=sc.nextInt();
        // int number[]=new int[size];
        // for(int i=0;i<number.length;i++){
        //     number[i]=sc.nextInt();
        // }
        // for(int i=0; i<number.length;i++){
        //     System.out.println(number[i]);
        // }




        // Linear search example

            // int arr[]={1,2,3,4,5};
            // Scanner sc= new Scanner(System.in);
            // int n= sc.nextInt();
            // for(int i=0;i<arr.length;i++){
            //     if(n == arr[i]){
            //         System.out.println(i);
            //     }
            // }
            
                // Arrays sorting 

            Integer arr[]={12,6,4,9,0};
            java.util.Arrays.sort(arr, Collections.reverseOrder());
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");



            
            }
    }       
}
