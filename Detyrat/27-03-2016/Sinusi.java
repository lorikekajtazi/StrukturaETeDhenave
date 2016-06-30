//Llogarit vleren e sinusit
public class Sinusi{

 private Faktorieli f = new Faktorieli();  
   
 public double sinus(double x)
 { 
 double sin = x;// vlera, ne radiane, sinusi i te ciles deshirohet
 int numeruesi = 3;
 while ( numeruesi <= 19 )
 { 
 double d = Math.pow(x, numeruesi) / f.faktoriel(numeruesi);
 if ( (numeruesi % 4) == 3 )
 { sin = sin - d; }
 else 
 { sin = sin + d; }
 numeruesi = numeruesi + 2;
 }
 return sin;
 }
 public static void main(String[] args){
 System.out.println(new Sinusi().sinus(1));
 }
}