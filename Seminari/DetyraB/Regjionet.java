public class Regjionet {
   private String regjioni = "";
   private Kandidatet k;
   private int vota = 0;
   
   //krijohet konstruktori qe mer si parametra nje string emrin e regjionit dhe nje objekt kandidatet
   public Regjionet(String regjioni, Kandidatet k){
   this.regjioni = regjioni;
   this.k = k;
   }
   
   //setVote e rrit numrin e votes ne kete regjion dhe e rrit numrin e votave te kandidatit i cili merret ne konstruktor duke thirrur metoden e klases Kandidatet getVote()
   public void setVote() {
   k.setVote();
   vota++;
   }
   
   // kthen numrin e votave te ketij regjioni
   public int getVote(){ 
   return vota;
   }
   
   // kthen emrin e ketij regjioni
   public String getRegjioni() {
   return regjioni;
   }
   
   //kthen emrin e kandidatit te nominuar ne kete regjion 
   public String getName(){
   return k.getName(); 
   }
   
}