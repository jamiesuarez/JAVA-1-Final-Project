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
public class BadCop extends Sheriff implements OutOfLaw {
    
    int nbKidnappedLadies;
    int reward;
    String look;
    Boolean isInPrison;
    
    public BadCop(int nbKidnappedLadies, int reward, String look, boolean isInPrison, int popularity, String adjective, int cash, String name, String favoriteDrink){
        super(popularity, adjective, cash, name, favoriteDrink);
        this.nbKidnappedLadies = nbKidnappedLadies;
        this.reward = reward;
        this.look = look;
        this.isInPrison = isInPrison;   
    }
    
    public void getReward(int cash){
        reward += cash;
    }
    
    public void beImprisoned(Cowboy cowboy){
        speak("Damn you " + cowboy.name + "!");
        isInPrison = true;
        cowboy.cash += reward;
    }
    
    public void kidnappedLady(DistressedLady distressedLady) {
        if (!distressedLady.hasBeenKidnapped) {
            speak("You are mine now, " + distressedLady.name + "!");
            nbKidnappedLadies++;
            distressedLady.hasBeenKidnapped(this);
        }
      }

    public void escape() {
        if (this.isInPrison) {
            isInPrison = false;
            act(this.name + " escapes");
            speak("I am free!");
            }
      }
}
