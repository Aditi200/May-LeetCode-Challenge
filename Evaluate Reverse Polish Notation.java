class Solution {

private boolean isSign(String c) {
    if(c.equals("+") || c.equals("-") || c.equals("/") ||c.equals("*")) 
        return true;
    return false;
}
public int evalRPN(String[] tokens) {
      Stack<String> st = new Stack<>();
      for(String s : tokens) {
           if(isSign(s)){
               String sign = s;
               int y = Integer.parseInt(st.pop());
               int x = Integer.parseInt(st.pop());
               int res = 0;
               switch(sign){
                   case "+": 
                       res = x+y;
                       break;
                   case "-":
                       res = x - y;
                       break;
                   case "*":
                       res = x * y;
                       break;
                   case "/":
                       res = x/y;
               }
               
             st.push(String.valueOf(res));  
           } else{
               st.push(s);
           } 
      }
    
    return Integer.parseInt(st.pop());
}
}