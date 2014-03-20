package recordNanograph.SovellusLogiikka;

import java.util.Scanner;

public class MainLoop {
    private Scanner lukijaOlio;
    private String menuKomento;
    private Library mainLibrary;
    
    public MainLoop(){
        this.lukijaOlio = new Scanner(System.in);
        this.mainLibrary = new Library(this.lukijaOlio);
    }
    
    public void kaynnista(){
        
        while(true){
            
            System.out.print("Syötä komento: ");
            
            this.menuKomento = this.lukijaOlio.nextLine();
            
            if (this.menuKomento.equals("NewAlbum")){
                this.mainLibrary.addAlbum();    
            }
            
            if (this.menuKomento.equals("FindTrackByNumber")){
                
                System.out.print("Album Title: ");
                String albumTitle = this.lukijaOlio.nextLine();
                System.out.print("Track Number: ");
                this.mainLibrary.
                
            }
            
        }
    }
    
}
