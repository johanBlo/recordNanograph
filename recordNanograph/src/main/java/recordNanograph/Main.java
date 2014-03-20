package recordNanograph;

import recordNanograph.SovellusLogiikka.MainLoop;
import java.util.Scanner;

public class Main{
    
    public Scanner lukijaOlio;

    public static void main( String args[]){              // Olio vain käynnistystä varten
        
        MainLoop paaOhjelma = new MainLoop();
        paaOhjelma.kaynnista();   
        
    }
    
}
