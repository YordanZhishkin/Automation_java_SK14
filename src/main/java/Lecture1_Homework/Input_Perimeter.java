import java.util.Scanner;

public class Input_Perimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input side a: ");
        int side_a = scanner.nextInt();

        System.out.print("Input side b: ");
        int side_b = scanner.nextInt();

        System.out.print("Input side c: ");
        int side_c = scanner.nextInt();

        int perimeter = side_a + side_b + side_c;
        System.out.println("Perimeter is: " + perimeter);

    }

}
