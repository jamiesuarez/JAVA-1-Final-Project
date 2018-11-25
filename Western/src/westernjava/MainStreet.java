package westernjava;

import java.util.ArrayList;

/**
 *
 * @author Matias & Suarez
 */
public class MainStreet extends Places {

      Jail jail;

      /**
       * constructor
       *
       * @param name name of street
       * @param people people on street
       */
      public MainStreet(String name, ArrayList<Human> people) {
            super(name, people);
            this.jail = jail;
      }

      /**
       * leave place
       *
       * @param person leaves
       */
      @Override
      public void exit(Human person) {
            people.remove(person);
      }

      /**
       * allows a character to enter in the places
        *
        * @param person person who enters the place
       */
      @Override
      public void enter(Human person) {
            person.place = this;
            people.add(person);
      }

}
