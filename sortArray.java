

// 11. Create array of integers and sort it.

public class sortArray {
    public static void main(String[] args) {
       int a[] = new int[]{5,8,6,3,1,2};
       System.out.println("Array before sorting: ");
       for(int i = 0;i < 6;i++){
           System.out.print(a[i]+" ");
       }
    //    Arrays.sort(a);
    for (int i = 0; i < a.length - 1; i++) {
        for (int j = i + 1; j < a.length; j++) {
            if (a[i]>a[j]) {
                // swapping array elements   // selction sort
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
    System.out.println("\nArray after sorting: ");
    for(int i = 0;i < 6;i++){
        System.out.print(a[i]+" ");
        }
    }
}
