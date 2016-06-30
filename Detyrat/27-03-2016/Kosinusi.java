//Llogarit vleren e kosinusit
public class Kosinusi{

private Faktorieli f = new Faktorieli(); 

 public double kosinus(double x)
 { 
 double cos = 1;
 int numeruesi = 2;
 while ( numeruesi <= 20 )
 { 
 double d = Math.pow(x, numeruesi) / f.faktoriel(numeruesi);
 if ( (numeruesi % 4) == 2 )
 { cos = cos - d; }
 else 
 { cos = cos + d; }
 numeruesi = numeruesi + 2;
 }
 return cos;
 }
 public static void main(String[] args){
 System.out.println(new Kosinusi().kosinus(1));
 }
}