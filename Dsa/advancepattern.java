public class advancepattern {
    public static void main(String []args){
        // int n=4;
        // for(int i =1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     int space= 2*(n-i);
        //     for(int j=1;j<=space;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i =n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     int space= 2*(n-i);
        //     for(int j=1;j<=space;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // solid rhombus

            // int n =5;
            // for(int i=1;i<=n;i++)
            // {
            //     int space =n-i;
            //     for(int j=1;j<=space;j++)
            //     {
            //         System.out.print(" ");
            //     }
            //     for(int j=1;j<=n;j++)
            //     {
            //         System.out.print("*");
            //     }
            //     System.out.println("");
            // }
            // empty rhombus
            // int n =5;
            // for(int i=1;i<=n;i++)
            // {
            //     int space =n-i;
            //     for(int j=1;j<=space;j++){
            //         System.out.print(" ");
            //     }
                
            //     for(int j=1;j<=n;j++)
            //     {
            //         if(i==1||j==1||i==n||j==n){
            //         System.out.print("*");
            //         }else{
            //             System.out.print(" ");
            //         }
            //     }
            
            //     System.out.println("");
            // }

            // int n=5;
            // for(int i=1;i<=5;i++){
            //     int spaces=n-i;
            //     for(int j=1;j<=spaces;j++)
            //     {
            //         System.out.print(" ");
            //     }
            //     for(int j=1;j<=i;j++)
            //     {
            //         System.out.print(i+" ");
            //     }
            //     System.out.println("");
            // }

            // int n=5;
            // for(int i=1;i<=n;i++){
            //     int space=n-i;
            //     for(int j=1;j<=space;j++){
            //         System.out.print(" ");
            //     }
            //     for(int j=i;j>=1;j--)
            //     {
            //         System.out.print(j);
            //     }
            //     for(int j=2;j<=i;j++)
            //     {
            //         System.out.print(j);
            //     }
            //     System.out.println(" ");
            // }

            int n=5;
            for(int i=1;i<=n;i++)
            {
                int spaces=n-i;
                for(int j=1;j<=spaces;j++)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=2*i-1;j++)
                {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            for(int i=n; i>=1;i--)
            {
                int spaces=n-i;
                for(int j=1;j<=spaces;j++)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=2*i-1;j++)
                {
                    System.out.print("*");
                }
                System.out.println(" ");
            }



    }
}

