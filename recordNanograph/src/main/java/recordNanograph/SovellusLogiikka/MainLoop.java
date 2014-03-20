package recordNanograph.SovellusLogiikka;

import java.util.Scanner;

public class MainLoop {
    
    private Scanner reader;
    private String menuKomento = null;
    private Library mainLibrary;
    
    public MainLoop(Scanner readerIn){
        
        this.reader = readerIn;
        this.mainLibrary = new Library(this.reader);
    
    }
    
    public void kaynnista(){
        
        while(true){
            
            System.out.print("Enter command (Type EXIT to quit or HELP for example commands): ");
            
            this.menuKomento = this.reader.nextLine();
            
            if (this.menuKomento.equals("NewAlbum")){
                
                System.out.print("Album Title: ");                
                this.mainLibrary.addAlbum(this.reader.nextLine());   
            
            }
                        
            if (this.menuKomento.equals("PrintLibraryMemory")){
                
                this.mainLibrary.PrintAlbumsInLibrary();
            
            }
            
            if (this.menuKomento.equals("HELP")){
                
                commandHelp();
            
            }
            
            if (this.menuKomento.equals("EXIT")){
                
                break;
            
            }
           
        }
    }
    
    public void commandHelp(){
        
        System.out.println("List of implemented command:");
        System.out.println("NewAlbum\t\t- Adds an Album to the currently loaded Library");
        System.out.println("PrintLibraryMemory\t- Prints all the albums saved in the current Library");
        System.out.println("EXIT\t\t\t- Terminates the program\n");
    
    }
    
    public Library getLibrary(){
        return this.mainLibrary;
    }
   
}
