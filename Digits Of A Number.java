import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = 0, temp;
        temp = n;

        do {
            temp = temp / 10;
            count++;
        } while (temp != 0);

        int div = (int)Math.pow(10 , count-1);
        
        do{
            int q = n/div;
            System.out.println(q);
            n = n%div;
            div = div/10;
        }while(div != 0);
    }
}