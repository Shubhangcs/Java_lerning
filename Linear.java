import java.util.Scanner;
public class Linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the array elements");
        int[] arr = new int[100];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int el = sc.nextInt();
        int j = linearSearch ( arr , el);
        if(j == 0){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element if found in "+j+" Position");
        }
    }
     static int linearSearch(int arr[] , int term){
        if(arr.length == 0){
            return 0;
        }
        for(int i = 0 ; i<arr.length ; i++){
            int elem = arr[i];
            if(elem == term){
                return i;
            }
        }
        return 0;
     }
}
