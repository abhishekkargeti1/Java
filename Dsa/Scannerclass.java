import java.util.*;
class Scannerclass {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();
        // nextLine for the input of whole sentence 
        System.out.println(name);

    }
}
