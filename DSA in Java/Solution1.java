import java.util.*;
class Solution {
    public static void main(String []args)
    {
      int num[]={2,11,7,15};    
       int First =1,Second =1,out = 1,target=9,index1=0,index2=0;
       for(int i=0;i<num.length;i++)
       {
         First =num[i];
         index1 =i;
         for(int j=i + 1;j<num.length;j++)
         {
           Second= num[j];
           index2=j;
          out = First+Second;
         if(out == target)
         {
           System.out.println(index1 +" "+index2);
           break;
         }
        }
         
       }
      
    }
}