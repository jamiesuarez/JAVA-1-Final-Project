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

public class Cowboy extends Human implements PaleFace {
    
    private int popularity = 10;
    private String adjective;
   
    
    public Cowboy(String name, String favoriteDrink, String adjective){
        super(name, favoriteDrink);
        this.adjective = adjective;
        introduce();
    }
    
    public int getPopularity(){
        return this.popularity;
    }
    
//    public void setPopularity(int popularity) {
//        this.popularity = popularity;
//    }
//    
//    public void setAdjective(String adjective) {
//        this.adjective = adjective;
//    }
    
    public String getAdjective(){
        return this.adjective;
    }
    
    @Override
    public void introduce(){
        super.introduce();
        speak("People call me " + this.name + " the " + this.getAdjective() + ".");
    }
    
    public String whoAreYou(){
        return this.getName() + " the " + this.getAdjective();
    }
    
    public static void shoot(Bandit bandit, LadyBandit ladyBandit) {
        
        
    }
    
    public void freeLady(DistressedLady lady) {
      this.popularity += 10;
      
      lady.hasBeenReleased(this);  
        
    }
    
    public void aScalp(Indian indian){
        
    }
       
}
