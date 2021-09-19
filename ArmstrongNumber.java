import java.util.Scanner;
public class Main2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number;
        int num;
        int last_digit;
        int num_cube;
        int sum=0;
        System.out.println("Enter the number");
        number = scanner.nextInt();
        num = number;
        while(number >0){
            last_digit = number%10;
            number/=10;
            num_cube =last_digit*last_digit*last_digit;
            sum += num_cube;
        }
        if(num == sum){
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is not Armstrong");
        }
    scanner.close();
    }
}
