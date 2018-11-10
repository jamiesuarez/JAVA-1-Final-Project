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
public class Bandit extends Human implements OutOfLaw, PaleFace {
    
    int nbKidnappedLadies;
    int reward;
    String look;
    boolean isInPrison = false;
    
    public Bandit(String name,  String favoriteDrink, String look){
        super(name, favoriteDrink);
        this.nbKidnappedLadies = nbKidnappedLadies;
        this.isInPrison = isInPrison;
        this.look = look;
        this.reward = 10;
    }
     
    public void introduce(){
        act(this.name + " introduces himself");
        speak("My name is " + this.name + " and I look "+ this.look + ". Don't mess with me!");
    }
    //bandits always end their dialogues with "!!!"
        
//    @Override
    public void escape(){
        if(this.isInPrison){
            isInPrison = false;
            act(this.name + " escapes");
            speak("I am free!");
        }
    }
               
    public void kidnappedLady(DistressedLady distressedLady){
        if (!distressedLady.hasBeenKidnapped) {
            act(this.name + " kidnapped " + distressedLady.name);
            speak("You are mine now, " + distressedLady.name + "!");
            nbKidnappedLadies++;
            reward += 10;
            distressedLady.hasBeenKidnapped(this);
        }
    }
    
        //returns name and look whenever the character bandit is called
    public String whoAreYou(){
        return this.getName() + " the " + this.look;
    }
}

