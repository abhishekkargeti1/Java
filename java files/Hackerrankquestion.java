import java.util.Scanner;

public class Hackerrankquestion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.print(s1);
            for(int j=0;j<=15-s1.length()-1;j++){
                System.out.print(" ");
            }
            String x1=String.valueOf(x);
            if(x1.length()>=3){
                System.out.println(x1);
            }else if(x1.length()==2){
                System.out.println("0"+x1);
            }else{
                System.out.println("00"+x1);
            }
        }
        System.out.println("================================");
    }
}
  // output 
// ================================
// java           100 
// cpp            065 
// python         050 
// ================================