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
public class DistressedLady extends Human {
    
    String state;
    String dressColor;
    
    public DistressedLady(String name, String favoriteDrink, String state, String dressColor){
        super(name, favoriteDrink);
        this.state = state;
        this.dressColor = dressColor;
        
    }
    
    public void hasBeenKidnapped(Bandit bandit){
        
    }
//    public void hasBeenKidnapped(LadyBandit ladyBandit){
//        
//    }
    
    public void hasBeenReleased(Cowboy cowboy){
        
        
        
    }
    
    public void changesDress(Cowboy cowboy){
        
    }
    
    @Override
    public void introduce(){
        super.introduce();
        System.out.println("I love standing out with my " + this.dressColor + "colored dress.");
    }

   
    
}
