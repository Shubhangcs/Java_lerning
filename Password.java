import java.util.*;
public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag =1;

        long pass = 0;

    while(flag == 1){
        System.out.println(":::::Password check menu:::::");
        System.out.println("1.Create a password");
        System.out.println("2.Login with the password");
        int a = sc.nextInt();
        switch (a){
            case 1:
                 pass = PassWord();
                System.out.println("Password successfully created ");
                break;
            case 2:
                long log = login(pass);
                if(log== 0){
                    System.out.println("Login failed");
                }
                else{
                    System.out.println("Login successful");
        }

            }
        }
    }
    static long PassWord(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password");
        long b = sc.nextLong();
        return b;
    }
    static int login(long pass){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password");
        long a = sc.nextLong();
        if(a == pass){
            return 1;
        }
        return 0;
    }

}
