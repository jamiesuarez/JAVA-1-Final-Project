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
public class LadyBandit extends DistressedLady implements OutOfLaw {
    
    int nbLadiesKidnapped;
    int reward;
    String look;
    Boolean isInPrison = false;
    
    public LadyBandit(String name,  String favoriteDrink,String state, String dressColor, String look){
        super(name, favoriteDrink, state, dressColor);
        this.look = look;
        this.reward = 10;
        introduce();
    }
    
//    @Override
//    public void speak(String say){
//       // super.speak(say);
//       System.out.println(name + ": "+ say+ "!!!");
//    }
//        
//    @Override 
//    public void introduce(){
//        
//        speak("My name is " + this.name + " and I look "+ this.look);
//        speak("Don't mess with me!");
//    }
    //bandits always end their dialogues with "!!!"
        
      //returns name and look whenever the character bandit is called
    public String whoAreYou(){
        return this.getName() + " the " + this.look;
        }
    
    public void kidnapLady(DistressedLady lady){
        this.reward += 10;
        this.nbLadiesKidnapped++; 
        // lady.hasBeenKidnapped(this);
        speak("You're mine now " + lady.getName());      
    }
    
    public String getReward(){
       // convert int to string return this.reward;
    }
    
    public void beImprisoned(Cowboy cowboy){
        
    }
    
    public String whatIsYourName(){
        return this.name;
    }
 
     
    
}
