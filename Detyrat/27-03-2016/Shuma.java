//Shuma e nje numri te plote negativ: Shuma(i)=0+1+2+...+i
public class Shuma {

  public int shuma(int i)
  { 
  int totali = 0;// totali qe ne fillim eshte 0
  int numeruesi = 0;// numeruesi qe numeron deri ne i

  while ( numeruesi != i ) // kushti qe perderisa numeruesi eshte i ndryshem nga i te vazhdon cikli
  { 
  numeruesi = numeruesi + 1; // numeruesi qe qdo cikel rritet per 1
  totali = totali + numeruesi;// totali qe i shtohet vlera e numeruesit
  }
  return totali;
  }
public static void main(String[] args){

System.out.println(new Shuma().shuma(5)); // klasa Shuma qe e therret vetvveten ne ker rast dhe e ekzekuton pastaj metoden shuma
}
}