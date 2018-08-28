public class PsychometricTesting {
 static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) {
  int[] result = new int[lowerLimits.length];
  int finalIndex = 0;
  int count = 0;
  for (int i = 0; i < lowerLimits.length; i++) {
    count = 0;
   int LL = lowerLimits[i];
   int UL = upperLimits[i];
   for (int j = 0; j < scores.length; j++) {
    if (scores[j] >= LL && scores[j] <= UL) {
     count++;
    }
   }
   result[finalIndex] = count;
   finalIndex++;
  }
  return result;
 }
 public static void main(String[] args) {
  int scores[] = {1,3,5,6,8};
  int lLimits[] = {2};
  int uLimits[] = {6};
  int[] output = jobOffers(scores, lLimits, uLimits);
  for (int index = 0; index < output.length; index++) {
   System.out.println(output[index]);
  }
 }
}