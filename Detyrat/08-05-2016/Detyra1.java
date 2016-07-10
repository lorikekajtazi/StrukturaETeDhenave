public class Detyra1
{ 
   public void EratosthenesSieve(int number) 
   { int numberSquareRoot = (int) Math.sqrt(number);
      boolean[] isComposite = new boolean[number + 1];
      for (int m = 2; m <= numberSquareRoot; m++) 
      { 
         if (!isComposite[m]) 
         { System.out.print(m + " ");
            for (int k = m * m; k <= number; k += m)
               isComposite[k] = true;
         }
      }
      for (int m = numberSquareRoot; m <= number; m++)
         if (!isComposite[m])
            System.out.print(m + " ");
   }
   public static void main(String[] args)
   { Detyra1 p=new Detyra1();
      p.EratosthenesSieve(21);
   }
}