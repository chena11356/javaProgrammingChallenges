/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000*/

import java.util.Scanner;

public class Sum3 {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Numbers below which number? (Suggestion: 1000)");
    int n = scan.nextInt();
    int sum = 0;
    for (int i = 1; i < n; i++){
      if (i%3==0||i%5==0){
        sum+=i;
      }
    }
    System.out.println("Sum of all multiples of 3 or 5 below "+n+": "+sum);
  }
}