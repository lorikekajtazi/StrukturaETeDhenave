import javax.swing.*;
/*Perkthimi i rezultatit te provimit nga numra ne shkronja me SWITCH **/
public class PerkthimiInotes_Detyra1A
{
 public static void main(String[] args)
 {
  int c = new Integer(JOptionPane.showInputDialog("Shtyp piket qe keni mar ne provim:")).intValue();
  switch((c+10)/10) // e perdorim kete formul per arsye te rrumbullaksimit te vleres
  {
   case 5: case 4: case 3: case 2: case 1: { System.out.println("F"); 
              break; }// nese shfrytezuesi ka pike me pak se 50 ateher nota e tij eshte F
   case 6:{ System.out.println("E"); 
            break; }
   case 7:{ System.out.println("D");
            break; }
   case 8:{ System.out.println("C");
            break; }
   case 9:{ System.out.println("B");
            break; }
   case 10:{ System.out.println("A");
            break; }
   default: { System.out.println("Keni shtypur vler gabim, Vlera duhet te jete ndermjet 0-100");}// nese shfrytezuesi shtyp ndonje vler jasht kufizueshmeris 0-100 
    
 } 
 }
 } 