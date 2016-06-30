/*Per nje vit te dhene ne menyre interaktive nga shfrytezuesi tregohet se a eshte vit i brishte apo jo.**/
import javax.swing.*;
public class VitiIBrisht_Detyra1B
{
   public static void main(String[] args)
   {
   int viti = new Integer(JOptionPane.showInputDialog("Shtyp vitin: ")).intValue();
   
   if((viti%4)==0)//Me qe viti i brisht eshte shumfish i numrit 4 
   {
    JOptionPane.showMessageDialog(null, "Viti " + viti+ " eshte vit i brishte"); } 
   else
    { JOptionPane.showMessageDialog(null, "Viti " + viti+ " nuk eshte vit i brishte");  }
   }
}