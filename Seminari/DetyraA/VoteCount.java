import javax.swing.*;
public class VoteCount
{ 
  
  public static void main(String[] args) 
  { 
   // mer si hyrje interaktive numrin e kandidateve    a ke nqit klas poqe ta qiti qashtu po
    int num_candidates = new Integer(JOptionPane.showInputDialog(null, "Shtypni numrin e kandidateve: ")).intValue();               
    // krijon aq objekte te klases kandidatet sa ka kandidate
    Kandidatet[] kandidatet = new Kandidatet[num_candidates]; 
    // i inicializon objektet e krijuara
    for(int i=0; i<num_candidates; i++){
    String emri = JOptionPane.showInputDialog(null, "Shtypni emrin e kandidatit te " + (i+1));
    String adresa = JOptionPane.showInputDialog(null, "Shtypni adresen e kandidatit te " + (i+1));
    int mosha = new Integer(JOptionPane.showInputDialog(null, "Shtypni moshen e kandidatit te " + (i+1))).intValue();
    kandidatet[i] = new Kandidatet(emri, adresa, mosha);
    }
    // i shfaq te dhenat e kandidateve
    String display = ""; 
    for(int i =0; i< kandidatet.length; i++){
    display =  display + "Kandidati:  " + kandidatet[i].getName() + "   Jeton ne: " + kandidatet[i].getAddress() + "   dhe ka " + kandidatet[i].getAge() + " vjet \n" ;
    }
    JOptionPane.showMessageDialog(null, display);
    boolean ok = true;
    boolean processing = true;
    // behet votimi, ku mer si hyrje nje string dhe e krahason ate me emra te kandidateve nese perputhen thirret metoda setVote per te shtuar nje vote kandidatit ne fjale
    while ( processing )
          { 
            ok = true;
            String v = JOptionPane.showInputDialog("Votoni per (nese deshironi te dilni shtypni dil) :");
            if (v.toLowerCase().equals("dil")) {
            processing = false; }
            else { 
            for (int i =0; i<kandidatet.length; i++) {  
            if(kandidatet[i].getName().toLowerCase().equals(v.toLowerCase())) { 
               kandidatet[i].setVote(); 
               ok = false; 
               }
             }
             if(ok) { JOptionPane.showMessageDialog(null, "Ne nuk e njohim kete fjale: " + v); }
             }
            }
     // per te mos krijuar nje string te ri pasi qe ai i meparshmi nuk perdoret me e incializojme si te zbrast per ta perdorur me vone
     display=  "";
     String fituesi = "";
     // fillimisht inicializohet si kandidati qe ka me se shumti vota kandidati i pare pastaj krahasohet me kandidatet e tjer nese ndonje kandidat tjeter ka me shume vota se ky ateher max behet kandidati ne fjale
     int max = kandidatet[0].getVote();
     String maxx = "" + kandidatet[0].getName(); 
               for ( int i = 0;  i != kandidatet.length;  i = i + 1 ) 
        { display = display+ "Kandidati: " + kandidatet[i].getName() + " ka " + kandidatet[i].getVote() + " vota \n"; }
    int y= 1;
    while(y<kandidatet.length) {
       if(kandidatet[y].getVote() >= max) {
         max = kandidatet[y].getVote();
         maxx = "" +kandidatet[y].getName();
       }
    y++;
    }
    //e shikon nese rezultati eshte barazim mes kanditaeve 
    boolean barazim = false;
    for(int i=0; i<kandidatet.length; i++) {
      for(int j=0; j<kandidatet.length; j++) {
         if(i != j) {
         if(max == kandidatet[i].getVote() && max == kandidatet[j].getVote() ) {
         barazim = true;  }
         }
      }
    }    
    if(barazim) {
    display+= "----------------------------------------- \n" + "Rezultati eshte barazim "; }
    else {
    display += "----------------------------------------- \n" + "Fituesi eshte: "+ maxx + " me gjithsej vota: " + max; }
     JOptionPane.showMessageDialog(null, display); 
  
   }
}  
