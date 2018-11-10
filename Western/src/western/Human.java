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
public class Human {
    
    protected String name = "";
    protected String favoriteDrink = "";

    /**
     * @param args the command line arguments
     */

    public Human(String name, String favoriteDrink){ 
        this.name = name; 
        this.favoriteDrink = favoriteDrink;
//        introduce();
    }
    
    protected String getName() {       
      return this.name;
    }
           
    public String getDrink() {    
        return this.favoriteDrink;        
    }
    
    public void speak(String say) {
        System.out.println(name + " : " + say);    
    }
    
    public void act(String action) {
        System.out.println("***" + action + "***");
    }
    
    public void introduce() {
        act(this.name + " introduces himself");
        speak("Hello! My name is " + name + ". I am a new citizen in town.");        
    }
}
