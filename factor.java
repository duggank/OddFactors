public class factor
{
  public static void main(String[] args)
  {
    System.out.println("anyOddFactors(1) returns " + anyOddFactors(1));
    System.out.println("anyOddFactors(0) returns " + anyOddFactors(0));
    System.out.println("anyOddFactors(3) returns " + anyOddFactors(3));
    System.out.println("anyOddFactors(-35) returns " + anyOddFactors(-35));
    System.out.println("anyOddFactors(19) returns " + anyOddFactors(19));
    System.out.println("anyOddFactors(52) returns " + anyOddFactors(52));
    
  }
  
  public static boolean anyOddFactors(int num)
  {
    int i = 3;
    num = Math.abs(num);
    
    while(i <= num)
    {
      if(num % i == 0)
        return true;
      i += 2;
    }
    return false;
  }
}