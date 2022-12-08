
import java.util.*;
class Numofsteps {
    public static void main(String args[] ) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
        String s = sc.next();   
         if(s.contains("HH")) 
        System.out.println("NO");  
        else {          
        s = s.replace('.', 'B');   
        System.out.println("YES");             
        System.out.print(s); 
     }
        }      
    }
}
