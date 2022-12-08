import java.util.Scanner;
public class Search {
   public static void main(String[] ar) {
            Scanner sc = new Scanner(System.in);
            //Main page
            System.out.println("#####  Welcome to data organization in array  #####");
            System.out.println("1.Store and search array elements");
            System.out.println("2.Create and insert and check array elements");
            System.out.println("3.Exit");
            System.out.println("Enter your choice");
            int n = sc.nextInt(); 
            if( n == 1){
               storeAndCheck();
            }
            else if(n == 2){
               instr();
            }
            else if(n == 3){
               exit();
            }
            else{
               System.out.println("Unknown criteria !!!!!!!");
            }
   }
   static void exit(){
      System.out.println("\t\t\t\t\t....Good-.-bye....");
   }
   static void instr(){
      Scanner sc = new Scanner(System.in);
      int i = 0 ;
      // Array insertion and deletion
      System.out.println("########## Welcome to insertion and deletion of array ##########");
      System.out.println("Enter the size of array required");
      int n = sc.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter the array elements");
      for( i = 0 ; i < n ; i++){
         arr[i] = sc.nextInt();
      }
      System.out.println("Enter the position");
      int pos = sc.nextInt();
      System.out.println("Enter the number to be inserted");
      int ins = sc.nextInt();
      for( i = n-1 ; i <= pos ; i--){
         if(i == pos){
         arr[i] = ins;
         n++;
         }
         
      }
      System.out.println("The entered array elements are");
      for(i = 0 ; i < n ; i++){
         System.out.print(arr[i]+" ");
      }
      
   }
  static void storeAndCheck() {
        Scanner sc = new Scanner(System.in);
        System.out.println("########## Welcome to store and check array elements ##########");
        //Array declaration and input array element
        int s = 0;
        System.out.println("Enter the size of array : ");
        int ne = sc.nextInt();
        int[] dat = new int[ne];
        System.out.println("Enter the array elements : ");
        for(int i = 0 ; i < ne ; i++ ){
            
            dat[i] = sc.nextInt(); 
        }
        System.out.println("Enter any number to be searched : ");
        int key = sc.nextInt();
         for(int i = 0 ; i < ne ; i++){
            if(dat[i] == key){
                 s++;
            }
         }
         if(s == 0){
            System.out.println("Number not found");
         }
         else{
            System.out.println("Number found");
         }
      System.out.println("");
        main(null);
        
    }
}
