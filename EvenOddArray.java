import java.util.Scanner;

// 12. Java Program to Put Even & Odd Elements of an Array in 2 Separate Arrays

public class EvenOddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[]{1,5,8,4,54,6,5,9,45,52,4,11,54,58,};
        int evenCount = 0;
        int even[] = new int[a.length];
        int oddCount = 0;
        int odd[] = new int[a.length];
        for(int i = 0;i < a.length;i++){
            if(a[i]%2 == 0){
                even[evenCount++] = a[i];
            }
            else{
                odd[oddCount++] = a[i];
            }
        }
        System.out.print("Even array: ");
        for(int i = 0;i < evenCount;i++){
            System.out.print(even[i]+" ");
        }
        System.out.print("\nodd array: ");
        for(int i = 0;i < oddCount;i++){
            System.out.print(odd[i]+" ");
        }
        sc.close();
    }
}
