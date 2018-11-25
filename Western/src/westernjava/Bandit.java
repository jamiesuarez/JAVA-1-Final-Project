
package westernjava;

/**
 *
 * @author Matias & Suarez
 */
public class Bandit extends Human implements OutOfLaw {

      int nbKidnappedLady;
      int reward;
      String look;
      boolean isInJail;

      /**
       * constructor
       *
       * @param nbKidnappedLady number of kidnapped girls
       * @param reward reward on his head
       * @param look attitude
       * @param isInJail true if jailed
       * @param name name
       * @param favoriteDrink favorite drink
       * @param place current place
       */
      
      public Bandit(int nbKidnappedLady, int reward, String look, boolean isInJail, String name, String favoriteDrink, Places place) {
            super(name, favoriteDrink, place);
            this.nbKidnappedLady = nbKidnappedLady;
            this.reward = reward;
            this.look = look;
            this.isInJail = isInJail;
      }

      /**
       * escape from prison
       */
      @Override
      public void escape() {
            if (this.isInJail) {
                  isInJail = false;
                  action(this.name + " escapes");
                  talk("I'M FREE!!!");
                  this.goOut();
            }
      }

      /**
       * presents
       */
      @Override
      public void introduceYourself() {
            action(this.name + " presents");
            talk("I am " + name + ". I will destroy this city's dreams and hopes!!");
      }

      /**
        * kidnap a girl
        *
        * @param girl is the girl to kidnap
       */
      @Override
      public void kidnappedLady(Lady girl) {
            if (!girl.isKidnapped) {
                  action(this.name + " kidnappe " + girl.name);
                  talk(girl.name + ", tu es à moi maintenant!");
                  nbKidnappedLady++;
                  girl.getKidnapped(this);
            }
      }

      /**
        * get put in jail
        *
        * @param boy the sheriff who puts you in prison
        * @param places list of places available
       */
      @Override
      public void getInJail(Cowboy boy, Places[] places) {
            action(boy.name + " a mis " + this.name + " en prison");
            talk("Merde! Je me vengerais " + boy.name + "!");
            isInJail = true;
            this.goTo(places[1]);
            boy.money += reward;
      }

      /**
        * adds money to the reward
        *
        * @param money the reward added
       */
      @Override
      public void addReward(int money) {
            reward += money;
            action("money = " + reward);
      }
    @Override
    public String getReward(){
       return "reward :" + this.reward; 
    }
    @Override
    public String whatIsYourName(){
        return this.getName() + " the " + this.look;
    }
}
