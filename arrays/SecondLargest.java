import java.util.*;
public class solution {
  public static int findSM(int arr[]) {
        if(arr.length<2){
            throw new IllegalArgumentException("Array must have atleast two elements");
        }
        int max = Integer.MIN_VALUE;
        int sM = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                sM = max;
                max = arr[i];
            }
            else if(arr[i]>sM && arr[i]<max){
                sM = arr[i];
            }
        }
        if(sM==Integer.MIN_VALUE){
            throw new IllegalArgumentException("No second largest element");
        }
        return sM;
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    System.out.println(findSM(arr));
    }
}
