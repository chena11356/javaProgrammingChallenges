public class Prime10001{
  public static int nthPrime(int n) {
    int res, count;
    for(res = 2, count = 0; count < n; ++res) { //check if number is prime, and if so, increment count
        if (isPrime(res)) {
            ++count;
        }
    }
    //After count reaches n, res is too big so decrement by 1
    return res-1;
  }
  public static boolean isPrime(int n) {
    for(int i = 2; i < n; ++i) {
        if (n % i == 0) { //if has factor, return false
            return false;
        }
    }
    return true; //else, return true
  }
  public static void main(String[] args){
    System.out.println("10001st prime is "+nthPrime(10001));
  }
}