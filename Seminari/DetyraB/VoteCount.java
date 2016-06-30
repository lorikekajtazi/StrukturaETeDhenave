import javax.swing.*;
public class VoteCountB
{ 
  
  public static void main(String[] args) 
  { 
    //merr si hyrje numrin e kandidateve
    int num_candidates = new Integer(JOptionPane.showInputDialog(null, "Shtypni numrin e kandidateve: ")).intValue(); 
    //krijon aq objekte te klases kandidatet sa eshte numri i kandidateve hej              
    Kandidatet[] kandidatet = new Kandidatet[num_candidates];
    // i inicializon objektet me te dhenat qe merren si hyrje interaktive  
    for(int i=0; i<num_candidates; i++){ 
    String emri = JOptionPane.showInputDialog(null, "Shtypni emrin e kandidatit te " + (i+1));
    String adresa = JOptionPane.showInputDialog(null, "Shtypni adresen e kandidatit te " + (i+1));
    int mosha = new Integer(JOptionPane.showInputDialog(null, "Shtypni moshen e kandidatit te " + (i+1))).intValue();
    kandidatet[i] = new Kandidatet(emri, adresa, mosha);
    }
    //krijon objekt dydimenzional te klases Regjionet me numer te rreshtave 3 dhe numer te shtyllave aq sa ka kandidat
    Regjionet[][] regjionet = new Regjionet[3][num_candidates];
    // i inicializon regjionet ku se pari merret si hyrje regjioni  pastaj ne ate regjion futen te gjith kandidatet
    for(int i =0; i<regjionet.length; i++){
      String regjioni = JOptionPane.showInputDialog("Shtyp regjionin e " +(i+1));
      for(int j=0; j<num_candidates; j++){
      regjionet[i][j] = new Regjionet(regjioni, kandidatet[j]);
      }
    }
    
    // i shfaq te dhenat e te gjith kandidateve
    String display = ""; 
    for(int i =0; i< kandidatet.length; i++){
    display =  display + "Kandidati:  " + kandidatet[i].getName() + "   Jeton ne: " + kandidatet[i].getAddress() + "   dhe ka " + kandidatet[i].getAge() + " vjet \n" ;
    }
    JOptionPane.showMessageDialog(null, display);
    boolean ok = true;
    String error = "";
    boolean processing = true;
    //behet votimi ku se pari pyet ne cilin regjion votohet pastaj pyet nese perputhet emri i regjionit me regjionin e inicializuar me pare dhe emri i kandidatit me kandidatet e inicializuar me pare
    while ( processing )
          { 
            ok = true;
            String r = JOptionPane.showInputDialog("Nga cili regjion votoni (nese deshironi te dilni shtypni dil) : ");
            if (r.toLowerCase().equals("dil")) {
            processing = false; }
            else { 
            String v = JOptionPane.showInputDialog("Votoni per:");
            for (int i =0; i<regjionet.length; i++) { 
               for (int j =0; j<kandidatet.length; j++){
               if(regjionet[i][j].getName().toLowerCase().equals(v.toLowerCase()) && regjionet[i][j].getRegjioni().toLowerCase().equals(r.toLowerCase())) { 
               regjionet[i][j].setVote(); 
               ok =false;
               }
              }
             }
             if(ok) { JOptionPane.showMessageDialog(null, "Ne nuk e njohim kete fjale"); }
             
            }
         }
     //shfaq votat ne secilin regjion per secilin kandidat dhe e tregon fituesin 
     display=  "";
     String fituesi = "";
     int max = kandidatet[0].getVote();
     String maxx = "" + kandidatet[0].getName();
     for (int i =0; i<regjionet.length; i++){
     display += "--------------------------------------------------------------------------------------------------------------- \n";
      for(int j =0; j<kandidatet.length; j++) {
      display = display + "Kandidati: "+ regjionet[i][j].getName() + " ka kaq vota: "+regjionet[i][j].getVote() + " ne regjionin e " + regjionet[i][j].getRegjioni() + " \n" ;
      }
     }
    int y= 1;
    while(y<kandidatet.length) {
       if(kandidatet[y].getVote() >= max) {  
         max = kandidatet[y].getVote();
         maxx = "" +kandidatet[y].getName();
       }
    y++;
    }
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
