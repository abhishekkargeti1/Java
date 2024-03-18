import java.util.*;
public class Arrays2D {
    public static void main(String []args){
        //     int row,colunm;
        //     Scanner sc = new Scanner(System.in);
        //     row = sc.nextInt();
        //     colunm = sc.nextInt();
        //     int arr [][]= new int [row][colunm];
        //     for(int i=0;i<row;i++){
        //         for(int j=0;j<colunm;j++){
        //         arr[i][j]=sc.nextInt();
        //     }
        // }
        // for(int i=0;i<row;i++){
        //     for(int j=0;j<colunm;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }  



            Scanner sc = new Scanner(System.in);
            int row , column,searchelement;
            boolean found = false;
            row =sc.nextInt();
            column= sc.nextInt();
            int arr[][]= new int[row][column];
            for(int i=0;i<row;i++){
                for(int j=0;j<column;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter a element to be search in array ");
            searchelement= sc.nextInt();
            for(int i=0;i<row;i++){
                for(int j=0;j<column;j++){
                    if(searchelement == arr[i][j] ){
                        System.out.println(i+" "+j);
                        found = true;
                    }
                }
            }
            if(!found){
                System.out.println("Element not found");
            }
            sc.close();
    }
}
