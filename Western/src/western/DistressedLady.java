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
    boolean hasBeenKidnapped;
    
    public DistressedLady(boolean hasBeenKidnapped, String name, String favoriteDrink, String state, String dressColor){
        super(name, favoriteDrink);
        this.hasBeenKidnapped = hasBeenKidnapped;
        this.state = state;
        this.dressColor = dressColor;
        introduce();
    }
    
    public void hasBeenKidnapped(Bandit bandit){
        act(bandit.name + " kidnapped " + this.name);
        speak("Let me go, " + bandit.name + "!");
        hasBeenKidnapped = true;
    }
    
    public void hasBeenKidnapped(BanditLady banditLady){
        act(banditLady.name + " kidnapped " + this.name);
        speak("Let me go, " + banditLady.name + "!");
        hasBeenKidnapped = true;
    }
    
    public void hasBeenKidnapped(BadCop badCop){
        act(badCop.name + " kidnapped " + this.name);
        speak("Let me go, " + badCop.name + "!");
        hasBeenKidnapped = true;
    }
    
    public void hasBeenReleased(Cowboy cowboy){
        act(cowboy.name + " saved " + this.name);
        speak("Thank you," + cowboy.name + "!");
        hasBeenKidnapped = false;
    }
    
    public void changesDress(Cowboy cowboy){
        String[] arrColors = {"red", "white", "black", "blue"};
//        int color = random.nextInt(arrColors.length);
//        dressColor = arrColors[color];
//        action(this.name + " change de culotte");
        speak("I love my new " + this.dressColor + " dress.");     
    }
    
    @Override
    public void introduce(){
        super.introduce();
        System.out.print("I love standing out with my " + this.dressColor + " colored dress.");
    }

   
    
}
