import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the lower limit");
        int low = scn.nextInt();
        System.out.println("Please enter the higher limit");
        int high = scn.nextInt();
        for (int i = low; i <= high; i++) {
            int count = 0;
            for (int div = 2; div * div <= i; div++) {
                if (i % div == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }
    }
}