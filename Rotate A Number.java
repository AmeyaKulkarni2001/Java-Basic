import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int count = 0,temp = n,div = 1,mul = 1;
        
        do{
            temp = temp/10;
            count++;
        }while(temp != 0);
        
        k = k % count;
        if(k < 0){
            k = k + count;
        }
        
        for(int i = 1; i <= count; i++){
            if(i <= k){
                div = div * 10;
            }
            else{
                mul = mul * 10;
            }
        }
        int q = n / div;
        int r = n % div;
        
        int num = r * mul + q;
        System.out.println(num);
    }
}
