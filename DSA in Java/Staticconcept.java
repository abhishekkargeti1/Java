import java.util.*;

public class Staticconcept {
  static boolean flag =false;
  static Scanner s1 = new Scanner(System.in);
  static int H= s1.nextInt();
  static   int B=s1.nextInt();
  static{
  if(H>0 && B>0)
    {
      flag =true;
    }
    else{
      System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
  }
   public static void main(String[] args) {
   
     	if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}
}