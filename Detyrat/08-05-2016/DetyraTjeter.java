import javax.swing.*;
public class DetyraTjeter
{ 
   public static void main(String[ ] args)
   { int[] kodi = new int[ 27] ; 
      int k = new Integer(JOptionPane. showInputDialog("Shkruaje nj� num�r t� plot� : ") ) . intValue() ;
      kodi[0] = k;
      for ( int i = 1; i != kodi. length; i = i+1 )
      { kodi[i] = (int) ((kodi[i-1] * 1.3) + 1) ; 
      }
      String pergjigjja = "";
      boolean duke_perpunuar = true;
      while ( duke_perpunuar )
      { String hyrja = JOptionPane. showInputDialog("Shkruaje nj� num�r t� plot� p�r ta dekoduar dhe asgj� p�r t� p�rfunduar: ") ;
         if ( hyrja. equals("") )
         { duke_perpunuar = false; 
         }
         else { char c = dekodo(kodi, new Integer(hyrja) . intValue() ) ;
            pergjigjja = pergjigjja + c;
         }
      }
      System. out. println(pergjigjja) ;
   }
   private static char dekodo(int[ ] kodi, int i)
   { char c = '*' ;
      boolean u_gjet = false;
      int indeksi = 0;
      while ( ! u_gjet && indeksi != kodi. length )
      { 
         if ( kodi[ indeksi] == i )
         { u_gjet = true;
            if ( indeksi == 0 )
            { c = ' ' ; }
            else { c = (char) (indeksi + 'a' - 1) ; }
         }
         else { indeksi = indeksi + 1; }
      }
      return c;
   }
}