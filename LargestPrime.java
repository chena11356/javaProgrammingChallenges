/*The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?*/

import java.math.BigInteger;
import java.util.ArrayList;

public class LargestPrime {

    public static void main(String[] args) {
      BigInteger x = new BigInteger("600851475143");
      BigInteger prime = new BigInteger("0"); //temp value
      ArrayList<BigInteger> arr = new ArrayList<BigInteger>(); //list to store factors
      
      
        
      for (BigInteger i = new BigInteger("2"); i.compareTo(x.divide(new BigInteger("2"))) < 1; i = i.add(new BigInteger("1"))){ //start at 2; keep dividing until less than 1; increment i
        if (x.mod(i).equals(new BigInteger("0"))) //if it is a factor
          if (isPrime(i)){ //if it is a PRIME factor
            prime = i;
            x = x.divide(prime); //divide the number for efficiency so the program doesn't take forever
            arr.add(prime);
          }
      }
        
      //then check to see if any factors were missed by dividing through contents of arrayList
      ArrayList<BigInteger> arr2 = new ArrayList<BigInteger>();
      x = new BigInteger("600851475143");
      for (BigInteger factors : arr){
        x = x.divide(factors);
        if (isPrime(x))
          arr2.add(x);
      }
      
      System.out.println("Prime factors of 600851475143 are: ");

      for (BigInteger factors: arr){
        System.out.println(factors);
      }
      for (BigInteger factors : arr2){
        System.out.println(factors);
      }
      
      System.out.println("\nLargest prime factor is "+arr2.get(arr2.size()-1));
      
      
    }

    public static boolean isPrime (BigInteger number){
      for (BigInteger i = new BigInteger("2"); i.compareTo(number.divide(new BigInteger("2"))) < 1; i = i.add(new BigInteger("1"))){ //start at 2; keep dividing until less than 1; increment i
        if (number.mod(i).equals(new BigInteger("0"))) //if it is a factor, false
                return false;
      }
      return true;
    }
}