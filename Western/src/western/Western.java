/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package western;

/**
 *
 * @author jamiealexis.suarez
 */
public class Western {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Once upon a time, in the wild wild west...");
        System.out.println();


        
        Human lexi = new Human("Lexi", "Tequila");  
        System.out.println();
        lexi.introduce();

        Cowboy luke = new Cowboy("Lucky Luke", "Fanta Citron", "Brave");
        System.out.println();
        
        System.out.println();
        luke.speak("Nice to meet you " +  lexi.getName() + "!");
        lexi.speak("Nice to meet you too " +  luke.getName() + " the " + luke.getAdjective()+"!");
        
        
        
        
        
       // Bartender job = new Bartender("Job", "Whiskey", "The Great West");
        
       DistressedLady jamie = new DistressedLady("Dazzling Jamie", "Citron", "frightened", "black");
        
       // Indian maske = new Indian("Maske", "Coconut", "totem Tiger");
       
       // BadCop rafa = new BadCop("Rafa", "CocaCola", "ugly");
       

                
        
        System.out.println();
        luke.speak("Nice to meet you " +  lexi.getName() + "!");
        lexi.speak("Nice to meet you too " +  luke.getName() + " the " + luke.getAdjective()+"!");
        
        // LOKI KIDNAPS JAMIE SCENE 
        System.out.println();
        System.out.println("All of a sudden... a drunk scary man enters one of the saloons.");
        System.out.println();
        Bandit loki = new Bandit("Loki", "Gin", "Scary");
        loki.kidnapLady(jamie);

        // luke.introduce();

        
        
        
        
    }

    
}

