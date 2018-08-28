import java.util.Stack;

public class solution {
 static int[] balancedOrNotFun(String[] expressions, int[] maxReplacements) {
  int[] isBN = new int[expressions.length];
  int b = 0;
  for (String expression: expressions) {
   boolean isB = false;
   Stack < Character > bStack = new Stack < > ();
   for (char c: expression.toCharArray()) {
  
      if(c == '<'){
        bStack.push(c);
      }
      else if(c == '>'){
        if (!bStack.isEmpty() && bStack.peek() == '<') {
             isB = true;
             bStack.pop();
            } else{
             bStack.push(c);
            }

      }
      else{
        bStack.push(c);
      }

   }
   if (!bStack.isEmpty()) {
    isB = false;
    int unmatched = 0;
    while (!bStack.isEmpty()) {
     if (bStack.pop() == '>') {
      unmatched++;
     }
    }
    if (unmatched == maxReplacements[b])
     isB = true;
   }
   if (isB == true)
    isBN[b] = 1;
   b++;
  }
  return isBN;
 }
 public static void main(String[] args) {
  String exp[] = {"<>","<>><"};
  int max[] = {1,0
  };
  int[] output = balancedOrNotFun(exp, max);
  for (int i = 0; i < output.length; i++) {
   System.out.println(output[i]);
  }
 }
}
