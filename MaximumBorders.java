
import java.util.*;
public class MaximumBorders {

    public static void main(String args[] ) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int ans = 0;
        int maxAns = 0;
        for(int i = 0 ; i < T ; i++){
            int test = sc.nextInt();
            int size = sc.nextInt();
            ans = 0;
            maxAns = 0;
            for(int j = 0 ; j < test ; j++){
                 ans =0;
                String name = sc.next();
                for(int k = 0 ; k < size ; k++){
                    if(name.charAt(k) == '#'){
                        ans++;
                    }
                }
                if(ans > maxAns){
                    maxAns = ans;
                }
            }
            System.out.println(maxAns);
        }
    }
    }

