public class solution {
 public static void main(String[] args) {
  System.out.println(minNum(4, 5, 1));
 }
 public static int minNum(int A, int K, int P) {
  int aasha = A + P;
  int kelly = K;
  int days = 1;
  if (K <= A)
   return -1;
  for(int i = days; kelly <= aasha; i++){
      aasha += A;
      kelly += K;
      days ++;
  }
  return days;
 }
}