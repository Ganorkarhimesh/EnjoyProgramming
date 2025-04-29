import java.util.Scanner;

public class scratch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of rectangle:");
        int length = input.nextInt();

        System.out.println("Enter width of rectangle:");
        int width = input.nextInt();

        int perimeter = 2*(length + width);
        System.out.println("perimeter of rectangle is :"+perimeter);

        System.out.println("Enter a Number:");
        Float number = input.nextFloat();
        System.out.println("Entered number is :"+ number);
    }
}
