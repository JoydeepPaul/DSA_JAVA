import java.util.*;
public class p5 {
  public static void main(String[] args) {
    int num = 1;
  
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  for(int i = 1; i<=a;i++){
    for(int j = 1; j <= i ; j++){
      System.out.print(num+" ");
      num++;
    }
    System.out.println();
  }
}
}
