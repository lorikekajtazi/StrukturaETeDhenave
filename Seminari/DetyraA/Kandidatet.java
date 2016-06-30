public class Kandidatet{   
   private String name = "";
   private String address =""; 
   private int age = 0;
   private int vota = 0;
   
   //Krijohet konstruktori ku mer si parametra Emrin e kandidatit Adresen dhe Moshen, this. i referohet kesaj klase 
   public Kandidatet(String name, String address, int age) { 
   this.name = name;
   this.address = address;
   this.age =age;
   }
   
   //kthen emrin e kandidatit
   public String getName() {
   return name;
   }
   
   //kthen adresen e kandidatit
   public String getAddress() { 
   return address;
   }
   
   //kthen moshen e kandidatit
   public int getAge() {
   return age; }
   
   //shton nje vote kandidatit kur te thirret kjo metod
   public void setVote() {
   vota = vota+1; }
   
   //kthen numrin e votave te kandidatit
   public int getVote() {
   return vota;
   }
}