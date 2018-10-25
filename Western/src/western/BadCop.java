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
    
    int nbLadiesRemoved;
    int reward;
    String look;
    Boolean isInPrison;
    
    public BadCop(String name, String favoriteDrink, String adjective){
        super(name, favoriteDrink, adjective);
        
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
