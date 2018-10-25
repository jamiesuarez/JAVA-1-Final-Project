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
    
    int nbLadiesKidnapped;
    int reward;
    String look;
    private boolean isInPrison = false;
    
    public Bandit(String name,  String favoriteDrink, String look){
        super(name, favoriteDrink);
        this.look = look;
        this.reward = 10;
        introduce();
    }
    
    @Override
    public void speak(String say){
       // super.speak(say);
       System.out.println(name + ": "+ say+ "!!!");
    }
        
    @Override 
    public void introduce(){
        
        speak("My name is " + this.name + " and I look "+ this.look);
        speak("Don't mess with me!");
    }
    //bandits always end their dialogues with "!!!"
        
        
    public void kidnapLady(DistressedLady lady){
        this.reward += 10;
        this.nbLadiesKidnapped++; 
        lady.hasBeenKidnapped(this);
        speak("You're mine now " + lady.getName());
    }
        
        //returns name and look whenever the character bandit is called
    public String whoAreYou(){
        return this.getName() + " the " + this.look;
        }
 
    public void aScalp(Indian indian){
         
    }
     
    public void beImprisoned(Cowboy cowboy){
         
    }
     
    public String whatIsYourName(){
        return this.name;
    }
    public String getReward(){
       // convert int to string return this.reward;
    }
     
    }

