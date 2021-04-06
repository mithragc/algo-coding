import java.util.Scanner;

public class ValidParenthesis {

    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
   String inputString = s.next();   
   int res=findValidParenthesis(inputString);
   System.out.println(res);

    }
    static  int findValidParenthesis(final String inputString){
        int  start , end;
        start = end = 0;
        for(int cntI = 0 ; cntI < inputString.length(); cntI++){
            char ch = inputString.charAt(cntI);
            if(ch == '(')
                start++;
            else if(ch == ')')
                end++;
        }
        return Math.min(start,end) * 2;
    }
}
