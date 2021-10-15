
// 13. Create array of Strings and sort it.

public class sortStringArray {
    public static void main(String[] args) {
        String s[] = new String[] { "Ayush", "Pratik", "Anup", "Prajwal", "Yash","Abhishek"};
        int size = s.length;
        System.out.println("Array of string before sorted: ");
        for(int i = 0;i < size;i++){
            System.out.print(s[i]+", ");
        }
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i].compareTo(s[j]) > 0) {
                    // swapping array elements
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        // prints the sorted array in ascending order
        System.out.println("\nSorted array of string: ");
        for(int i = 0;i < size;i++){
            System.out.print(s[i]+", ");
        }
    }
}
