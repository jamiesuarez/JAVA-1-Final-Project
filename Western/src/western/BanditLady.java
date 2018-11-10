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
public class BanditLady extends DistressedLady implements OutOfLaw {
    
    int nbKidnappedLadies;
    int reward;
    String look;
    boolean isInPrison;
    
    public BanditLady(String name, String favoriteDrink, String state, String dressColor, String look, int nbLadiesKidnapped, boolean hasBeenKidnapped, boolean isInPrison){
        super(hasBeenKidnapped, name, favoriteDrink, state, dressColor);
        this.look = look;
        this.reward = 10;
        this.nbKidnappedLadies = nbKidnappedLadies;
        this.isInPrison = isInPrison;
    }
    
//      @Override
      public void kidnappedLady(DistressedLady distressedLady) {
        if (!distressedLady.hasBeenKidnapped) {
            act(this.name + " kidnapped " + distressedLady.name);
            speak("You are mine now, " + distressedLady.name + "!");
            nbKidnappedLadies++;
            reward += 10;
            distressedLady.hasBeenKidnapped(this);
        }
      }
      
//    @Override
    public void escape(){
        if(this.isInPrison){
            isInPrison = false;
            act(this.name + " escapes");
            speak("I am free!");
        }
    }
}
