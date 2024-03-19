import java.util.*;
class Strings {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("My name is  "+name);


        //concatenation

        String Firstname = "Abhishek";
        String Lastname ="Kargeti";
        String Fullname =Firstname+" "+Lastname;
        System.out.println(Fullname);

        // length 
        System.out.println(Fullname.length());

        // to print single character 

        for(int i=0;i<Fullname.length();i++){
            System.out.println(Fullname.charAt(i));
        }

        // campare to strings
        String name1 ="Abhishek";
        String name2 ="Abhishek";
        
        // case 1 s1>s2 = +ve value
        // case 1 s1 == s2 = 0
        // case 1 s1<s2 = -ve value
        if(name1.compareTo(name2)==0){
            System.out.println("String are equal");
        }else{
            System.out.println("String are not  equal");

        }


        // substrings 

        String sentence= "I am abhishek";
        String name3 =sentence.substring(5,sentence.length());
        System.out.println(name3);


    }
    
}
