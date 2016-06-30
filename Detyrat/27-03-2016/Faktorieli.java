// Faktorieli i nje numri jonegativ
public class Faktorieli{

  public int faktoriel(int n)
  { 
  int  faktorieli = -1; // nese vlera esht e ndryshme nga kushti me posht ateher kthehet -1
  if ( n >= 0 && n <= 20 ) // pasi qe vlerat per n>20 jane shume te medha per llogaritje dhe vlerat negative nuk llogariten
  { 
  int numeruesi = 0; 
  faktorieli = 1; //faktorieli n fillim ka vleren 1
  while ( numeruesi != n )
  { numeruesi = numeruesi + 1;
    faktorieli = faktorieli * numeruesi;
  }
  }
  return faktorieli;
}
public static void main(String[] args){
System.out.println(new Faktorieli().faktoriel(15));
}
}