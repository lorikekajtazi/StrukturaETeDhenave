//Prodhimi i numrave te plot jo negativ  nga a ne b:
public class Prodhimi {  
   
   public  int prodhimi(int a, int b)// numri a- numri fillues i prodhimit kurse b-numri mbarues
   { 
   int totali = 1;  // nese a<b kthen 1

   
   if ( a <= b ) // nese a<=b kthen prodhimin e fituar ne metod
   { 
   totali = a; 
   int numeruesi = a;
   while ( numeruesi != b ){ //perderisa numeruesi i ndryshem nga b vazhdon cikli 
   numeruesi = numeruesi + 1; // numeruesit i shtohet nga 1 ne qdo hap te ciklit perderisa ai ekzekutohet
   totali = totali * numeruesi; }// totalit i shumozohet ne secilin hap numeriuesi
   }
   return totali; }  // ne fund e kthen totalin 
    
   public static void main(String[] args) {
   System.out.println(new Prodhimi().prodhimi(2,5));
   } 
   }