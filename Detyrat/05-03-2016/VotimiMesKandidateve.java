import javax.swing.*;
public class VotimiMesKandidateve {
	public static void main(String[]args)
	{
   
int limit = 5;   
int count = 0;

while (count < limit)
{
JOptionPane.showMessageDialog(null,"Pershendetje i/e nderuar votues!");
JOptionPane.showMessageDialog(null,"Ju po beheni pjese e votimit ne perzgjidhjen mes Kanditatit 1 dhe Kandidatit 2 ");//
String e=JOptionPane.showInputDialog("Ju lutem shkruani emrin dhe mbiemrin tuaj :");
String mo=JOptionPane.showInputDialog("Ju lutem shkruani moshen tuaj:");

int mosha = new Integer(mo).intValue();

if (mosha<18)
{JOptionPane.showMessageDialog(null,"Kerkojme falje por votimi eshte i lejushem vetem per votues mbi moshen 18 vjeqare.");}
else
{
String sh = JOptionPane.showInputDialog("Shtypni 1 ose 2 varesisht se cilin nga kandidatet ju deshironi ta votoni. ");
int sh1 =new Integer(sh).intValue();
if (sh1 == 1)
{
JOptionPane.showMessageDialog(null, "Ju votuat per kandidatin 1.");

JOptionPane.showMessageDialog(null,"Votimi ishte i suksesshem!");
JOptionPane.showMessageDialog(null,"Falemnderit qe moret pjese ne votim.");
System.out.println("Edhe nje vote me shume per kandidatin numer 1. ");
}

else
{
if(sh1 == 2)
{
JOptionPane.showMessageDialog(null, "Ju votuat per kandidatin 2.");

JOptionPane.showMessageDialog(null,"Votimi ishte i suksesshem!");
JOptionPane.showMessageDialog(null,"Falemnderit qe moret pjese ne votim !");
System.out.println("Edhe nje tjeter vote eshte per kandidatin numer 2. ");
}


else
{
JOptionPane.showMessageDialog(null, "Gabim ! ");
JOptionPane.showMessageDialog(null,"Lejohet te shtypet vetem 1 ose 2 sepse kemi vetem 2 kanditate ");
}
count++;
}
}
}
}
}

	




	   

					    	
					    	
					    	
















                   
