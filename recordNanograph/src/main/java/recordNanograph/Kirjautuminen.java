package recordNanograph;

import java.util.Scanner;

public class Kirjautuminen {
    private Scanner reader;
    private String username = "admin"; //Väliaikainen
    private String password = "admin"; //Väliaikainen
    
    public Kirjautuminen(Scanner reader){
        this.reader = reader;
    
    }
    
    public boolean intro(){
        
        System.out.println("Welcome to Record Nanograph 0.1");
        System.out.println("-------------------------------");
        
        /* Käyttäjätunnus sekä salasana tarkistus */
        System.out.println("USERNAME: (admin for now)");
        Boolean usernameTestResult = usernameTest(this.reader.nextLine());
        
        System.out.println("PASSWORD: (admin for now)");
        Boolean passwordTestResult = passwordTest(this.reader.nextLine());
        
        if(usernameTestResult && passwordTestResult){return true;}
        else {System.out.println("Username or password incorrect!"); return false;}
        
    
    }
    
    public boolean usernameTest(String usernameInput){
        
        if(usernameInput.equals(this.username)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean passwordTest(String passwordInput){
        
        if(passwordInput.equals(this.password)){
            return true;
        }
        
        else{
            return false;
        }
    }
        
}
