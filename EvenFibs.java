//By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

public class EvenFibs {
  
   public static int fibonacci(int n) { //recursive fibonacci
        if (n <= 1)
          return n;
        else
          return fibonacci(n-1) + fibonacci(n-2);
    }
  
  public static void main(String[] args){
    int i = 0; //doesn't matter whether i starts at 0 or 1 since only even values, so sum starts at 2
    int sum = 0;
    while (fibonacci(i)<4000000){ //while less than 4 million
      if (fibonacci(i)%2==0) //if even, add on to sum
        sum+=fibonacci(i);
      i++;
    }
    System.out.println("Sum of even-valued fibonacci terms below 4 million: "+sum);
  }
}