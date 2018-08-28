public class solution {
 public static void main(String[] args) {
  int firstarr[] = {1,2,3};
  int secondarr[] = {2,1,3};
  String sType = "even";
  System.out.println(winner(firstarr, secondarr, sType));
 }
 static String winner(int[] first, int[] second, String s) {
  int index = s.toLowerCase().equals(s) ? 1 : 0;
  int firstCount = 0;
  int secondCount = 0;
  for(int i = index; i < first.length ; i += 2){
       firstCount += first[i] - second[i];
       secondCount += second[i] - first[i];
  }
  if (firstCount > secondCount)
   return "Andrea";
  else if (firstCount < secondCount)
   return "Maria";
  else
   return "Tie";
 }
}