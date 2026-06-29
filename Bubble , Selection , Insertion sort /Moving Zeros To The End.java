import java.util.Scanner;
public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int l=arr.length;
        int j=0;
        for (int i=0;i<l;i++){
                if(arr[i]!=0){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                
                j++;
            }
            
        }
        System.out.println("Array after moving zeros to the end");
        for ( int num : arr){
            System.out.println(num + " ");
        }
    sc.close();
    }

}
