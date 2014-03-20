package recordNanograph;

import java.util.Scanner;
import recordNanograph.SovellusLogiikka.MainLoop;

public class Main{
    
    public Scanner reader;

    public static void main( String args[]){              // Olio vain käynnistystä varten
        
        MainLoop paaOhjelma = new MainLoop(new Scanner(System.in));
        Kirjautuminen kirjaudus = new Kirjautuminen(new Scanner(System.in));
        
        if(kirjaudus.intro() == true){
                paaOhjelma.kaynnista();   
        }
        
        else{}   
    }
    
}
