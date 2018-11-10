package western;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jamiealexis.suarez
 */
public class Bartender extends Human {
    
    String barName;
    
    public Bartender(String name, String favoriteDrink, String barName){
        super(name, favoriteDrink);
        this.barName = barName;
    }
    
    public void serve() {
        
    }
    
    public void torch(String t) {
        
    }
    
    
    
    @Override
    public void introduce() {
        speak("My name is " + name + " and it is a pleasure to serve you.");
        
    }
}
