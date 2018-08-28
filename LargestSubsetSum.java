public class solution {
 static long[] maxSubsetSum(int[] k) {
  int index = 0;
  long[] total = new long[k.length];
  for (int j = 0; j < k.length; j++) {
   int item = k[j];
   int maxNo = 0;
   for (int i = 1; i <= item; i++) {
    if (item % i == 0) {
     maxNo = maxNo + i;
    }
   }
   total[index] = maxNo;
   index++;
  }
  return total;
 }
 public static void main(String[] args) {
  int arr[] = {2,4};
  long[] output = maxSubsetSum(arr);
  for (int i = 0; i < output.length; i++) {
   System.out.println(output[i]);
  }
 }
}