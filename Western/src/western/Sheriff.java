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
public class Sheriff extends Cowboy {
    
    int nbCaughtBandits;
    
    public Sheriff(int popularity, String adjective, int cash, String name, String favoriteDrink){
        super(name, favoriteDrink, adjective, cash, popularity);
        this.nbCaughtBandits = nbCaughtBandits;  
    }
    
    public static void busted(Bandit bandit) {
//        act(this.name + " capture " + badboy.name);
//        bandit.getInJail(this, lieux);        
        
    }
    
    public static void busted(BanditLady ladyBandit) {
        
    }
    
    public static void search(Bandit bandit, BanditLady ladyBandit) {
        
    }
    
//    public static String whatIsYourName() {
//        
//    } 
    
    
}
