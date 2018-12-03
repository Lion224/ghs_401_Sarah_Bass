
public class StringArray
{
  public static void main() {
      int[] ageArray = {14,15,18,47,48};
      ageArray[0] = "Sophia";
      ageArray[1] = "Alexander";
      ageArray[2] = "Seri";
      ageArray[3] = "Michael";
      for ( i=0; i<ageArray; i++){
          System.out.println(i + " is " + ageArray[i]);
        }
    }
}
