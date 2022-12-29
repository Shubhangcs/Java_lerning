import java.util.*;
public class Zoos {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int cz = 0 ;
        int co = 0 ;
        String name  = sc.nextLine();
        int n = name.length();
        char[] org = name.toCharArray();
        for(int i = 0 ; i< n ; i++){
            if(org[i] == 'z'){
                cz++;
            }
            else{
                co++;
            }
        }
        if(co == 2*cz) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }



    }
}
