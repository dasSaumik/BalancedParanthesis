//import java.util.Scanner;
public class BalancedParanthesis 
{
     static int count=0;
    static boolean MatchingPair(char character1, char character2)
    {
       if (character1 == '(' && character2 == ')')
	{
		count++;
		return true;
	}
       else
         return false;
    }
    static boolean areParenthesisBalanced(char exp[])
    {
       Stack st=new Stack();
      
       for(int i=0;i<exp.length;i++)
       {
          if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[')
            st.push(exp[i]);
      
          if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']')
          {
             if (st.isEmpty())
               {
                   return false;
               } 
             else if ( !MatchingPair(st.pop(), exp[i]) )
               {
                   return false;
               }
          }
           
       }
       
       if (st.isEmpty())
         return true; /*balanced*/
       else
         {   /*not balanced*/
             return false;
         } 
    } 
    public static void main(String[] args) 
    {
        char exp[] = {'(','(',')',')','(',')'};
	
          if (areParenthesisBalanced(exp))
            System.out.println("Balanced Paranthes is : "+count);
          else
            System.out.println("Not Balanced ");  
    }
 
}