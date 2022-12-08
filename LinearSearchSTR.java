import java.util.Scanner;

public class LinearSearchSTR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String a = sc.next();
        System.out.println("Enter the character to be searched in the string");
        char b = sc.next().charAt(0);
        int z = Search(a , b );
        if(z == 0)
        System.out.println("Letter not found sorry");
        else
            System.out.print("The letter is found at position = " + z);

    }
    static int Search(String a , char b ){
     char[] d = a.toCharArray();
        for(int i = 0 ; i < d.length ;  i++) {
            if (d[i] == b) {
                return i+1;
            }
        }
        return 0;
    }
}
