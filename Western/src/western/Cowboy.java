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
    
    int popularity = 10;
    String adjective;
    int cash;
   
    
    public Cowboy(String name, String favoriteDrink, String adjective, int cash, int popularity){
        super(name, favoriteDrink);
        this.adjective = adjective;
        this.cash = cash;
        this.popularity = popularity;
    }
    
    public int getPopularity(){
        return this.popularity;
    }
    
    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }
    
    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }
    
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
    
    public void shoot(Bandit bandit, Sheriff sheriff) {
        act(this.name + " shot " + bandit.name);
        act("Bang!");
        speak("I have caught you, " + bandit.name + "!");
//        sheriff.catchAThug(badboy, lieux);
//        getReward(badboy);
    }
    
    public void freeLady(DistressedLady distressedLady) {
        if (distressedLady.hasBeenKidnapped) {
            act(this.name + " released " + distressedLady.name);
            speak("You are free, " + distressedLady.name + "!");
            distressedLady.hasBeenReleased(this);
        }
    }
    
    public void aScalp(Indian indian){
        
    }
       
}
