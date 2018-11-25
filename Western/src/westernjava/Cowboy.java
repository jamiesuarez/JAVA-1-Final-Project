/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package westernjava;

/**
 *
 * @author Matias & Suarez
 */
public class Cowboy extends Human implements PaleFace{

      int popularity;
      String adjective;
      int money;

      /**
       * constructor
       *
       * @param popularity popularity
       * @param adjective adjective
       * @param money earned with reward
       * @param name name
       * @param favoriteDrink favorite drink
       * @param place current place
       */
      public Cowboy(int popularity, String adjective, int money, String name, String favoriteDrink, Places place) {
            super(name, favoriteDrink, place);
            this.popularity = popularity;
            this.adjective = adjective;
            this.money = money;
      }

      /**
       * shoot villain and imprison
       *
       * @param badboy villain
       * @param cop sherriff
       * @param places places
       */
      public void shoot(Bandit badboy, Sheriff cop, Places[] places) {
            action(this.name + "shot " + badboy.name);
            action("Bang!!!");
            talk("I have caught you " + badboy.name + ".");
            cop.catchABandit(badboy, places);
            getReward(badboy);
      }

      /**
       * shoot villain and imprison
       *
       * @param badboy villain
       * @param cop sherriff
       * @param places places
       */
      public void shoot(BadCop badboy, Sheriff cop, Places[] places) {
            action(this.name + " shot " + badboy.name);
            action("Bang!!!");
            talk("I caught you " + badboy.name + ".");
            cop.catchABandit(badboy, places);
            getReward(badboy);
      }

      /**
       * free lady
       *
       * @param girl who is kidnapped
       */
      public void freeTheLady(Lady girl) {
            if (girl.isKidnapped) {
                  action(this.name + " freed " + girl.name);
                  talk("You are free" + girl.name + "!!");
                  girl.getFree(this);
            }

      }

      /**
       * reward
       *
       * @param badboy reward for his head
       */
      public void getReward(Bandit badboy) {
            action(this.name + " gets reward from " + badboy.name);
            money += badboy.reward;
            badboy.reward = 0;
      }

      /**
       * get reward
       *
       * @param badboy reward for his head
       */
      public void getReward(BadCop badboy) {
            action(this.name + " gets reward from " + badboy.name);
            money += badboy.reward;
            badboy.reward = 0;
      }

     
      @Override
      public void introduceYourself() {
            action(this.name + " presents.");
            talk("People call me  " + name + ", the "+ this.adjective + ". I'm the new cowboy.");
      }
      
//      @Override
//      public void Scalp(Indian indian){
//          talk("You have a pale face, " + indian.name + "!");
//      }
}
