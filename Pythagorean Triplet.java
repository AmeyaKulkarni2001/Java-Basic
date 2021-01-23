import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int temp;
        
        if(a>c && a>b){
            temp = (int)Math.pow(b,2) +(int)Math.pow(c,2);
        
            if(temp == Math.pow(a,2)){
                System.out.println("true");
            }
            else
                System.out.println("false");
        }
        else if(b>c && b>a){
            temp = (int)Math.pow(a,2) +(int)Math.pow(b,2);
        
            if(temp == Math.pow(c,2)){
                System.out.println("true");
            }
            else
                System.out.println("false");
        }
        else if(c>b && c>a){
            temp = (int)Math.pow(a,2) +(int)Math.pow(b,2);
        
            if(temp == Math.pow(c,2)){
                System.out.println("true");
            }
            else
                System.out.println("false");
        }
    }
}
