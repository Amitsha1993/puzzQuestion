public class solution {
 public static int waitingTime(int[] tickets, int p) {
  // Minimum time I have to wait is the number of tickets I want to buy.
  int wating = tickets[p];
  for (int index = 0; index < tickets.length; index++) {
   if (index == p) continue;
   wating += (Math.min(tickets[p], tickets[index]));
   if (index > p) {
    wating--;
   }
  }
  return wating;
 }
 public static void main(String[] args) {
  int t[] = {1,1,1,1};
  System.out.println(waitingTime(t, 0));
 }
}