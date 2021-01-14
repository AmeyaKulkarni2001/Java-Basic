import java.util.*;
  
class Main{
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int count = 0;
    
    do{
        n = n/10;
        count++;
    }while(n != 0);
    System.out.println(count);
   }
  }