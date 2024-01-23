import java.util.Scanner;

class Arrays {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 45;
        marks[1] = 45;
        marks[2] = 45;
        // System.out.println(marks[2]);
        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int x= sc.nextInt(); // Linear Search Algorithm

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("x found at " + i);
            }
            System.out.print(numbers[i]);
        }


    }
}
