public class Ushtrim2
{

   public String removeDuplicateLetters(String s)
   { 
    String answer = "";
    for ( int i = 0;  i != s.length();  i = i + 1 )
       { 
         if ( notFoundIn(answer, s.charAt(i)) )
            { answer = answer + s.charAt(i); }
       }
  return answer;
}

   private boolean notFoundIn(String a, char c)
   { boolean notfound = true;
     for ( int j = 0;  j != a.length();  j = j + 1 )
         { notfound = notfound  &&  (c != a.charAt(j)); 
   }
  return notfound;
}
public static void main(String[] args)
{ 
   System.out.println(new Ushtrim2().removeDuplicateLetters("ATENTAT"));
   
}
}   