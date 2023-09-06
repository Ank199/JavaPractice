import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number you want to search for:");
        int key = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                System.out.println("Found the number at index: " + i);
                found = true;
                break;
            }
        }

        if (found==false) {
            System.out.println("Not found");
        }
    }
}
