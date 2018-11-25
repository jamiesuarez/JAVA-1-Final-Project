package westernjava;

import java.util.Random;

/**
 * characterizes the Lady-type human
 *
 * @author Matias & Suarez
 */
public class Lady extends Human {

      boolean isKidnapped;
      String dressColor;
      String state;
      Random random = new Random();

      /**
       * constructor
       *
       * @param isKidnapped true if kidnapped
       * @param dressColor color of dress
       * @param name name
       * @param favoriteDrink favorite drink
       * @param place current place
       */
      public Lady(boolean isKidnapped, String dressColor, String name, String favoriteDrink, Places place, String state) {
            super(name, favoriteDrink, place);
            this.isKidnapped = isKidnapped;
            this.dressColor = dressColor;
      }

      /**
       * get kidnapped by boy
       *
       * @param badboy kidnapper
       */
      public void getKidnapped(Bandit badboy) {
            action(badboy.name + " has kidnapped " + this.name);
            talk("Let me go " + badboy.name + "!");
            isKidnapped = true;
      }

      /**
       * get kidnapped by girl
       *
       * @param badgirl kidnapper
       */
      public void getKidnapped(BanditLady badgirl) {
            action(badgirl.name + " has kidnapped " + this.name);
            talk("Let me go, " + badgirl.name + "!");
            isKidnapped = true;
      }

      /**
       * get kidnapped by boy
       *
       * @param badboy kidnapper
       */
      public void getKidnapped(BadCop badboy) {
            action(badboy.name + " has kidnapped " + this.name);
            talk("Let me go,  " + badboy.name + "!!");
            isKidnapped = true;
      }

      /**
       * be freed
       *
       * @param hero hero
       */
      public void getFree(Cowboy hero) {
            action(hero.name + " saves " + this.name);
            talk("AHH thank you so much " + hero.name + "!!!");
            isKidnapped = false;
      }

      /**
       * change dress color
       */
      public void getChanged() {
            String[] arrColors = {"rose", "black", "blue", "white"};
            int colors = random.nextInt(arrColors.length);
            dressColor = arrColors[colors];
            action(this.name + " changes dress");
            talk("I love my new " + this.dressColor + " dress.");     
      }

      /**
       * introduction
       */
      @Override
      public void introduceYourself() {
            action(this.name + " presents");
            talk("Hello! My name is " + name + ". I will show this town my beauty!");
      }

}
