import java.util.*;

class Main{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int p = 0,d,dig = 0;

        do{
            d = n % 10;
            p++;
            dig = dig +p * (int)Math.pow(10,d-1);
            n = n / 10;
        }while(n != 0);
        System.out.println(dig);
    }
}