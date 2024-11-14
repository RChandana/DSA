import java.util.*;
public class Main {
    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length;
        
        if(start <= end){
            int mid = (start + end) / 2;
            
            if(arr[mid] == target){
                System.out.println(mid);
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int target = sc.nextInt();
        
        int res = binarySearch(arr, target);
        
        if(res >= 0){
            System.out.println("Element found at : " + res);
        }
        else{
            System.out.println("Element Not Found");
        }
    }
}
