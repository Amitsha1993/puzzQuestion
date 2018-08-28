public class solution {
 static int consecutive(long num) {
   int sumCount = 0;
   for (int index = 1; index * (index + 1) < 2 * num; index++) {
    float a = (float)((1.0 * num - (index * (index + 1)) / 2) / (index + 1));
    if (a - (int) a == 0.0)
     sumCount++;
   }
   return sumCount;
  }
  // Driver code to test above function
 public static void main(String[] args) {
  long number = 15;
  System.out.println(consecutive(number));
 }
}