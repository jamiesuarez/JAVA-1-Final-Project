package westernjava;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 *
 * @author Matias & Suarez
 */
public class Action {

      Random random = new Random();
      Person person = new Person();

      /**
        * displays and executes available actions for the character => obj
        *
        * @param input 0 for random 1 to choose 2 for story
        * @param obj the character doing the action
        * @param list_places list of implemented places
        * @param list list of available characters
        * @return a character of type Lady
       */
      public Lady lady(int choice, Lady obj, Places[] list_places,
               ArrayList<ArrayList<ArrayList<Human>>> list) {
            try {
                  int num = 0;
                  System.out.println(obj.getClass());
                  Scanner scanner = new Scanner(System.in);
                  String input;
                  switch (choice) {
                        case 0:
                              num = random.nextInt(3);
                              break;
                        case 1:
                              System.out.println("Input 1 to Kidnap a Lady");
                              System.out.println("Input 2 to Change Dress");
                              System.out.println("Input 3 to Talk to Someone");
                              System.out.println("============================");
                              System.out.println("Input: ");
                              input = scanner.nextLine();
                              num = Integer.parseInt(input);
                              System.out.print("");
                              break;
                        default:
                              if (obj.place instanceof MainStreet) {
                                    //action dispo street
                                    System.out.println(obj.name + " is in " + obj.place.name);
                                    System.out.println("");
                                    System.out.println("Input 0 to Enter the Bar");
                                    System.out.println("Input 1 to Kidnap a Lady");
                                    System.out.println("Input 2 to Change Dress");
                                    System.out.println("Input 3 to Talk to Someone");
                                    System.out.println("============================");
                                    System.out.println("Input: ");
                                    input = scanner.nextLine();
                                    num = Integer.parseInt(input);
                                    System.out.print("");
                                    switch (num) {
                                          case (0):
                                                obj.goTo(list_places[0]);
                                                return obj;
                                    }
                              } else if (obj.place instanceof Bar) {
                                    System.out.println(obj.name + " is in  " + obj.place.name);
                                    System.out.println("");
                                    System.out.println("Input 1 to Kidnap a Lady");
                                    System.out.println("Input 2 to Change Dress");
                                    System.out.println("Input 3 to Talk to Someone");
                                    System.out.println("Input 4 to Order a Drink");
                                    System.out.println("Input 5 to Exit");
                                   System.out.println("============================");
                                    System.out.println("Input: ");
                                    input = scanner.nextLine();
                                    num = Integer.parseInt(input);
                                    System.out.print("");
                                    switch (num) {
                                          case (5):
                                                obj.goOut();
                                                return obj;
                                          case (4):
                                                obj.orderADrink(obj.favoriteDrink);
                                                return obj;
                                    }
                              } else if (obj.place instanceof Jail) {
                                    System.out.println(obj.name + " is in " + obj.place.name);
                                    return obj;
                              }
                              break;
                  }
                  switch (num) {
                        case (1):
                              BanditLady badlady = new BanditLady(0, 0, "mysterious", false, obj.isKidnapped, obj.dressColor, obj.name, obj.favoriteDrink, obj.place, obj.state);
                              list.get(0).get(0).remove(obj);
                              Lady girl = person.randomLady(list.get(0));
                              while (girl == obj) {
                                    girl = person.randomLady(list.get(0));
                              }
                              badlady.kidnappedLady(girl);

                              if (random.nextInt(2) == 1) {
                                    Sheriff cop = person.randomSherif(list.get(1));
                                    cop.catchABandit(badlady, list_places);
                                    cop.freeTheLady(girl);
                              }
                              return badlady;
                        case (2):
                              obj.getChanged();
                              return obj;
                        case (3):
                              if (!obj.place.people.isEmpty()) {
                                    Human someone = person.randomHuman(0, 0, list);
                                    while (someone == obj) {
                                          someone = person.randomHuman(0, 0, list);
                                    }
                                    obj.talkToSomeone(someone);
                              } else {
                                    System.out.println("You are currently alone. You cannot speak to anyone else.");
                              }
                              return obj;
                        default:
                              throw new Exception("unknown human");
                  }
            } catch (Exception ex) {
                  System.err.println(ex.getMessage());
                  System.out.println("You did not enter a number corresponding to an action.");
                  System.out.println("Try again.");
                  System.out.println("If you want to quit type 'quit', otherwise type something else");
                  return obj;
            }
      }

      /**
        *displays and executes available actions for the character obj
        *
        * @param input 0 for random, 1 to select, 2 for story
        * @param obj the character doing the action
        * @param list_places list of implemented places
        * @param list list of available characters
        * @return a character of type banditLady
       */
      public BanditLady banditlady(int choice, BanditLady obj, Places[] list_places,
               ArrayList<ArrayList<ArrayList<Human>>> list) {
            try {
                  int num = 0;
                  System.out.println(obj.getClass());
                  Scanner scanner = new Scanner(System.in);
                  String input;
                  switch (choice) {
                        case 0:
                              num = random.nextInt(3);
                              break;

                        case 1:
                              System.out.println("Input 1 to Kidnap a Lady");
                              System.out.println("Input 2 to Change Dress");
                              System.out.println("Input 3 to Talk to Someone");
                                  System.out.println("============================");
                                    System.out.println("Input: ");
                              
                              input = scanner.nextLine();
                              num = Integer.parseInt(input);
                              System.out.print("");
                              break;

                        default:
                              if (obj.place instanceof MainStreet) {
                                    //action dispo street
                                    System.out.println(obj.name + " is in " + obj.place.name);
                                    System.out.println("");
                                    System.out.println("Input 0 to Enter the Bar");
                                 System.out.println("============================");
                                    System.out.println("Input: ");
                                    input = scanner.nextLine();
                                    num = Integer.parseInt(input);
                                    System.out.print("");
                                    switch (num) {
                                          case (0):
                                                obj.goTo(list_places[0]);
                                                return obj;
                                    }
                              } else if (obj.place instanceof Bar) {
                                    System.out.println(obj.name + " is in " + obj.place.name);
                                    System.out.println("");
                                    System.out.println("Input 1 to Kidnap a Lady");
                                    System.out.println("Input 2 to Change Dress");
                                    System.out.println("Input 3 to Talk to Someone");
                                    System.out.println("Input 4 to Order a Drink");
                                    System.out.println("Input 5 to Exit");
                                   System.out.println("============================");
                                    System.out.println("Input: ");                                
                                    input = scanner.nextLine();
                                    num = Integer.parseInt(input);
                                    System.out.print("");
                                    switch (num) {
                                          case (5):
                                                obj.goOut();
                                                return obj;
                                          case (4):
                                                obj.orderADrink(obj.favoriteDrink);
                                                return obj;
                                    }
                              } else if (obj.place instanceof Jail) {
                                    System.out.println(obj.name + " is in " + obj.place.name);
                                   System.out.println("");
                                    System.out.println("Input 0 to Escape");
                                    System.out.println("Input 1 to Stay");
                                     System.out.println("============================");
                                    System.out.println("Input: "); 
                                    input = scanner.nextLine();
                                    num = Integer.parseInt(input);
                                    System.out.println(""); 
                                    switch (num) {
                                          case (0):
                                                if (random.nextInt(2) == 0) {
                                                      obj.escape();
                                                } else {
                                                      System.out.println("You have been caught. You did not manage to escape.");
                                                }
                                                return obj;

                                          case (4):
                                                System.out.println("You were hung for kidnapping the sheriff's daughter.");
                                                return obj;
                                    }
                              }
                              break;

                  }

                  switch (num) {

                        case (1):
                              Lady girl = person.randomLady(list.get(0));
                              while (girl == obj) {
                                    girl = person.randomLady(list.get(0));
                              }
                              obj.kidnappedLady(girl);
                              if (random.nextInt(2) == 1) {
                                    Sheriff cop = person.randomSherif(list.get(1));
                                    cop.catchABandit(obj, list_places);
                                    cop.freeTheLady(girl);
                              }
                              return obj;

                        case (2):
                              obj.getChanged();
                              return obj;

                        case (3):
                              if (!obj.place.people.isEmpty()) {
                                    Human someone = person.randomHuman(0, 0, list);
                                    while (someone == obj) {
                                          someone = person.randomHuman(0, 0, list);
                                    }
                                    obj.talkToSomeone(someone);
                              } else {
                                    System.out.println("You are currently alone. You cannot speak to anyone else.");
                              }
                              return obj;
                        default:
                              throw new Exception("unknown action");
                  }

            } catch (Exception ex) {
                  System.err.println(ex.getMessage());
                  System.out.println("You did not enter a number corresponding to an action.");
                  System.out.println("Please try again.");
                  System.out.println("If you want to leave type 'quit' otherwise type something else");
                  return obj;
            }

      }

      /**
        * displays and executes available actions for the character obj
        *
        * @param choice 0 for random, 1 to choose, 2 for history
        * @param obj the character doing the action
        * @param list_places list of implemented places
        * @param list list of available characters
        * @return a character of type Cowboy
       */
      public Cowboy cowboy(int choice, Cowboy obj, Places[] list_places,
               ArrayList<ArrayList<ArrayList<Human>>> list) {
            try {
                  int num = 0;
                  System.out.println(obj.getClass());
                  Scanner scanner = new Scanner(System.in);
                  String input;
                  switch (choice) {
                        case 0:
                              num = random.nextInt(6);
                              break;
                        case 1:
                              System.out.println("");
                              System.out.println("Input 1 to Free a Lady");
                              System.out.println("Input 2 to Kidnap a Lady");
                              System.out.println("Input 3 to Talk to Someone");
                              System.out.println("Input 4 to Shoot a Villain");
                                   System.out.println("============================");
                                    System.out.println("Input: ");
                              input = scanner.nextLine();
                              num = Integer.parseInt(input);
                                 System.out.println(""); 
                              break;
                        default:
                              if (obj.place instanceof MainStreet) {
                                    //action dispo street
                                    System.out.println(obj.name + " is in " + obj.place.name);
                                    System.out.println("");
                                    System.out.println("Input 0 to Enter the Bar");
                               System.out.println("Input 1 to Free a Lady");
                              System.out.println("Input 2 to Kidnap a Lady");
                              System.out.println("Input 3 to Talk to Someone");
                              System.out.println("Input 4 to Shoot a Villain");
                                   System.out.println("============================");
                                    System.out.println("Input: ");
                                    input = scanner.nextLine();
                                    num = Integer.parseInt(input);
                                 System.out.println(""); 
                                    switch (num) {
                                          case (0):
                                                obj.goTo(list_places[0]);
                                                return obj;
                                    }
                              } else if (obj.place instanceof Bar) {
                                    System.out.println(obj.name + " is in " + obj.place.name);
                                    System.out.println("");
                                    System.out.println("Input 1 to Free a Lady");
                                    System.out.println("Input 2 to Kidnap a Lady");
                                    System.out.println("Input 3 to Talk to Someone");
                                    System.out.println("Input 4 to Shoot a Villain");
                                    System.out.println("Input 5 to Order a Drink");
                                    System.out.println("Input 6 to Exit");
                                     System.out.println("============================");
                                    System.out.println("Input: ");
                                    input = scanner.nextLine();
                                    num = Integer.parseInt(input);
                                System.out.println(""); 
                                    switch (num) {
                                          case (6):
                                                obj.goOut();
                                                return obj;
                                          case (5):
                                                obj.orderADrink(obj.favoriteDrink);
                                                return obj;
                                    }
                              } else if (obj.place instanceof Jail) {
                                    System.out.println(obj.name + " is in " + obj.place.name);
                              }
                              break;
                  }
                  switch (num) {
                        case (1):
                              Lady girl = person.randomLady(list.get(0));
                              obj.freeTheLady(girl);
                              return obj;
                        case (2):
                              BadCop badcop = new BadCop(0, 0, "evil", false, obj.popularity, obj.adjective, obj.money, obj.name, obj.favoriteDrink, obj.place,0); // int
                              list.get(1).get(0).remove(obj);
                              girl = person.randomLady(list.get(0));
                              badcop.kidnappedLady(girl);
                              if (random.nextInt(2) == 1) {
                                    Sheriff cop = person.randomSherif(list.get(1));
                                    cop.catchABandit(badcop, list_places);
                                    cop.freeTheLady(girl);
                              }
                              return badcop;
                        case (3):
                              if (!obj.place.people.isEmpty()) {
                                    Human someone = person.randomHuman(0, 0, list);
                                    while (someone == obj) {
                                          someone = person.randomHuman(0, 0, list);
                                    }
                                    obj.talkToSomeone(someone);
                              } else {
                                    System.out.println("You are currently alone. You cannot speak to anyone else.");
                              }
                              return obj;
                        case (4):
                              switch (random.nextInt(2)) {
                                    case 0:
                                          Bandit badboy = (Bandit) person.randomHuman(2, 5, list);
                                          System.out.println("Input 1 to Imprison him and become Sheriff \nInput 2 to Disregard");
                                           System.out.println("============================");
                                           System.out.println("Input: ");
                                          input = scanner.nextLine();
                                          int becoming = Integer.parseInt(input);
                                           System.out.println("");
                                           switch (becoming) {
                                                case 1:
                                                      Sheriff cop = new Sheriff(0, obj.popularity, obj.adjective, obj.money, obj.name, obj.favoriteDrink, obj.place);
                                                      list.get(1).get(0).remove(obj);
                                                      cop.shoot(badboy, cop, list_places);
                                                      return cop;
                                                default:
                                                      cop = (Sheriff) person.randomHuman(2, 3, list);
                                                      obj.shoot(badboy, cop, list_places);
                                                      return obj;
                                          }
                                    default:
                                          BadCop badboy2 = (BadCop) person.randomHuman(2, 4, list);
                                          System.out.println("Input 1 to Imprison him and become Sheriff \nInput 2 to Disregard");
                                                           System.out.println("============================");
                                    System.out.println("Input: ");
                                          input = scanner.nextLine();
                                          becoming = Integer.parseInt(input);
                                         System.out.println("");
                                          switch (becoming) {
                                                case 1:
                                                      Sheriff cop = new Sheriff(0, obj.popularity, obj.adjective, obj.money, obj.name, obj.favoriteDrink, obj.place);
                                                      list.get(1).get(0).remove(obj);
                                                      cop.shoot(badboy2, cop, list_places);
                                                      return cop;
                                                default:
                                                      cop = (Sheriff) person.randomHuman(2, 3, list);
                                                      obj.shoot(badboy2, cop, list_places);
                                                      return obj;
                                          }
                              }
                        default:
                              throw new Exception("action unknown");
                  }
            } catch (Exception ex) {
                  System.err.println(ex.getMessage());
                  System.out.println("You did not enter a number corresponding to an action.");
                  System.out.println("Please try again.");
                  System.out.println("If you want to leave type 'quit' otherwise type something else");
                  return obj;
            }
      }

      /**
        * displays and executes available actions for the character obj
        *
        * @param input 0 for random 1 to select 2 for story
        * @param obj the character doing the action
        * @param list_places list of implemented places
        * @param list list of available characters
        * @return a sheriff type character
       */
      public Sheriff sherif(int choice, Sheriff obj, Places[] list_places,
               ArrayList<ArrayList<ArrayList<Human>>> list) {
            try {
                  int num = 0;
                  System.out.println(obj.getClass());
                  Scanner scanner = new Scanner(System.in);
                  String input;
                  switch (choice) {
                        case 0:
                              num = random.nextInt(6);
                              break;
                        case 1:
                              System.out.println("");
                              System.out.println("Input 1 to Free a Lady");
                              System.out.println("Input 2 to Shoot a Villain");
                              System.out.println("Input 3 to Talk to Someone");
                              System.out.println("Input 4 to State Reward for Villain");
                                               System.out.println("============================");
                                    System.out.println("Input: ");
                              input = scanner.nextLine();
                              num = Integer.parseInt(input);
                               System.out.println("");
                              break;
                        default:
                              if (obj.place instanceof MainStreet) {
                                    //action dispo street
                                    System.out.println(obj.name + " is at " + obj.place.name);
                                    System.out.println(obj.name + " is in " + obj.place.name);
                                    System.out.println("");
                                    System.out.println("Input 0 to Enter the Bar");
                                     System.out.println("Input 1 to Free a Lady");
                              System.out.println("Input 2 to Shoot a Villain");
                              System.out.println("Input 3 to Talk to Someone");
                              System.out.println("Input 4 to State Reward for Villain");
                                     System.out.println("============================");
                                    System.out.println("Input: ");
                                   input = scanner.nextLine();
                                    num = Integer.parseInt(input);
                                    System.out.println("");
                                    switch (num) {
                                          case (0):
                                                obj.goTo(list_places[0]);
                                                return obj;
                                    }
                              } else if (obj.place instanceof Bar) {
                                    System.out.println(obj.name + " is in " + obj.place.name);
                                    System.out.println("");
                                    System.out.println("Input 0 to Enter the Bar");
                                    System.out.println("Input 1 to Free a Lady");
                                    System.out.println("Input 2 to Shoot a Villain");
                                    System.out.println("Input 3 to Talk to Someone");
                                    System.out.println("Input 4 to Order a Drink");
                                    System.out.println("Input 5 to State Reward for Villain");
                                    System.out.println("============================");
                                    System.out.println("Input: ");
                                    input = scanner.nextLine();
                                    num = Integer.parseInt(input);
                                    System.out.println("");
                                    switch (num) {
                                          case (0):
                                                obj.goOut();
                                                return obj;
                                          case (4):
                                                obj.orderADrink(obj.favoriteDrink);
                                                return obj;
                                    }
                              } else if (obj.place instanceof Jail) {
                                    System.out.println(obj.name + " is in " + obj.place.name);
                                    return obj;
                              }
                  }
                  switch (num) {
                        case (1):
                              Lady girl = person.randomLady(list.get(0));
                              obj.freeTheLady(girl);
                              return obj;
                        case (2):
                              switch (random.nextInt(2)) {
                                    case 0:
                                          Bandit badboy = (Bandit) person.randomHuman(2, 5, list);
                                          obj.shoot(badboy, obj, list_places);
                                          return obj;

                                    default:
                                          BadCop badboy2 = (BadCop) person.randomHuman(2, 4, list);
                                          obj.shoot(badboy2, obj, list_places);
                                          return obj;
                              }
                        case (3):
                              if (!obj.place.people.isEmpty()) {
                                    Human someone = person.randomHuman(0, 0, list);
                                    while (someone == obj) {
                                          someone = person.randomHuman(0, 0, list);
                                    }
                                    obj.talkToSomeone(someone);
                              } else {
                                    System.out.println("You are currently alone. You cannot speak to anyone else.");
                              }
                              return obj;
                        case (5):
                              int money = random.nextInt(1234)*100;
                              switch (random.nextInt(2)) {
                                    case 0:
                                          Bandit badboy = (Bandit) person.randomHuman(2, 5, list);
                                          obj.searchABandit(badboy,money);
                                          return obj;

                                    default:
                                          BadCop badboy2 = (BadCop) person.randomHuman(2, 4, list);
                                          obj.searchABandit(badboy2, money);
                                          return obj;
                              }     
                        default:
                              throw new Exception("action inconnu");
                  }
            } catch (Exception ex) {
                  System.err.println(ex.getMessage());
                  System.out.println("You did not enter a number corresponding to an action.");
                  System.out.println("Please try again.");
                  System.out.println("If you want to leave type 'quit' otherwise type something else");
                  return obj;
            }
      }

      /**
            displays and executes available actions for the character obj
        *
        * @param input 0 for random 1 to select 2 for story
        * @param obj the character doing the action
        * @param list_places list of implemented places
        * @param list list of available characters
        * @return a sheriff type character
       */
      public BadCop badcop(int choice, BadCop obj, Places[] list_places,
               ArrayList<ArrayList<ArrayList<Human>>> list) {
            try {
                  int num = 0;
                  System.out.println(obj.getClass());
                  Scanner scanner = new Scanner(System.in);
                  String input;
                  switch (choice) {
                        case 0:
                              num = random.nextInt(6);
                              break;
                        case 1:
                             System.out.println("");
                              System.out.println("Input 1 to Free a Lady");
                              System.out.println("Input 2 to Kidnap a Lady");
                              System.out.println("Input 3 to Talk to Someone");
                              System.out.println("Input 4 to Shoot a Villain");
                               System.out.println("============================");
                                    System.out.println("Input: ");
                              input = scanner.nextLine();
                              num = Integer.parseInt(input);
                              System.out.println("");
                              break;
                        default:
                              if (obj.place instanceof MainStreet) {
                                    //action dispo street
                                    System.out.println(obj.name + " is in " + obj.place.name);
                                    System.out.println("");
                                    System.out.println("Input 0 to Enter the Bar");
                                    System.out.println("Input 1 to Free a Lady");
                                    System.out.println("Input 2 to Kidnap a Lady");
                                    System.out.println("Input 3 to Talk to Someone");
                                    System.out.println("Input 4 to Shoot a Villain");
                                       System.out.println("============================");
                                    System.out.println("Input: ");
                                    input = scanner.nextLine();
                                    num = Integer.parseInt(input);
                                    System.out.println("");
                                    switch (num) {
                                          case (0):
                                                obj.goTo(list_places[0]);
                                                return obj;
                                    }
                              } else if (obj.place instanceof Bar) {
                                    System.out.println(obj.name + " is in " + obj.place.name);
                                    System.out.println("");
                                    System.out.println("Input 0 to Enter the Bar");
                                    System.out.println("Input 1 to Free a Lady");
                                    System.out.println("Input 2 to Kidnap a Lady");
                                    System.out.println("Input 3 to Talk to someone");
                                    System.out.println("Input 4 to Shoot a Villain");
                                    System.out.println("Input 5 to Order a Drink");
                                    System.out.println("============================");
                                    System.out.println("Input: ");
                                    input = scanner.nextLine();
                                    num = Integer.parseInt(input);
                                    System.out.println("");
                                    switch (num) {
                                          case (0):
                                                obj.goOut();
                                                return obj;
                                          case (5):
                                                obj.orderADrink(obj.favoriteDrink);
                                                return obj;
                                    }
                              } else if (obj.place instanceof Jail) {
                                    System.out.println(obj.name + " is in " + obj.place.name);
                                    System.out.println("");
                                    System.out.println("Input 0 to Escape");
                                    System.out.println("Input 1 to Stay");
                                    System.out.println("============================");
                                    System.out.println("Input: ");
                                    input = scanner.nextLine();
                                    num = Integer.parseInt(input);
                                    System.out.println("");
                                    switch (num) {
                                          case (0):
                                                if (random.nextInt(2) == 0) {
                                                      obj.escape();
                                                } else {
                                                      System.out.println("You have been caught. You did not manage to escape.");
                                                }
                                                return obj;

                                          case (4):
                                                System.out.println("You've been hung for kidnapping the sheriff's daughter.");
                                                return obj;
                                    }
                              }
                              break;
                  }
                  switch (num) {
                        case (1):
                              Lady girl = person.randomLady(list.get(0));
                              obj.freeTheLady(girl);
                              return obj;
                        case (2):
                              girl = person.randomLady(list.get(0));
                              obj.kidnappedLady(girl);
                              int gettojail = random.nextInt(2);
                              if (gettojail == 1) {
                                    Sheriff cop = person.randomSherif(list.get(1));
                                    cop.catchABandit(obj, list_places);
                                    cop.freeTheLady(girl);
                              }
                              return obj;
                        case (3):
                              if (!obj.place.people.isEmpty()) {
                                    Human someone = person.randomHuman(0, 0, list);
                                    while (someone == obj) {
                                          someone = person.randomHuman(0, 0, list);
                                    }
                                    obj.talkToSomeone(someone);
                              } else {
                                    System.out.println("You are currently alone. You cannot speak to anyone else.");
                              }
                              return obj;
                        case (4):
                              switch (random.nextInt(2)) {
                                    case 0:
                                          Bandit badboy = (Bandit) person.randomHuman(2, 5, list);
                                          Sheriff cop = (Sheriff) person.randomHuman(2, 3, list);
                                          obj.shoot(badboy, cop, list_places);
                                          return obj;
                                    default:
                                          BadCop badboy2 = (BadCop) person.randomHuman(2, 4, list);
                                          cop = (Sheriff) person.randomHuman(2, 3, list);
                                          obj.shoot(badboy2, cop, list_places);
                                          return obj;
                              }
                        default:
                              throw new Exception("action inconnu");
                  }
            } catch (Exception ex) {
                  System.err.println(ex.getMessage());
                  System.out.println("You did not enter a number corresponding to an action.");
                  System.out.println("Please try again.");
                  System.out.println("If you want to leave type 'quit' otherwise type something else");
                  return obj;
            }
      }

      /**
        * displays and executes actions available for the character obj
        *
        * @param choice 0 for random 1 to choose 2 for history
        * @param obj the character doing the action
        * @param list_places list of implemented places
        * @param list list of available characters
        * @return a character of type bandit
       */
      public Bandit bandit(int choice, Bandit obj, Places[] list_places,
               ArrayList<ArrayList<ArrayList<Human>>> list) {
            try {
                  int num = 0;
                  System.out.println(obj.getClass());
                  Scanner scanner = new Scanner(System.in);
                  String input;
                  switch (choice) {
                        case 0:
                              num = random.nextInt(6);
                              break;
                        case 1:
                              System.out.println("");
                              System.out.println("Input 1 to Kidnap a Lady");
                              System.out.println("Input 2 to Talk to Someone");
                                 System.out.println("============================");
                                    System.out.println("Input: ");
                              input = scanner.nextLine();
                              num = Integer.parseInt(input);
                              System.out.println("");
                              break;
                        default:
                              if (obj.place instanceof MainStreet) {
                                    //action dispo street
                                    System.out.println(obj.name + " is in " + obj.place.name);
                                    System.out.println("");
                                    System.out.println("Input 0 to Enter the Bar");
                                    System.out.println("Input 1 to Kidnap a Lady");
                                    System.out.println("Input 2 to Talk to Someone");
                                    System.out.println("============================");
                                    System.out.println("Input: ");
                                    input = scanner.nextLine();
                                    num = Integer.parseInt(input);
                                    System.out.println("");
                                    switch (num) {
                                          case (0):
                                                obj.goTo(list_places[0]);
                                                return obj;
                                    }
                              } else if (obj.place instanceof Bar) {
                                    System.out.println(obj.name + " is in " + obj.place.name);
                                    System.out.println("");
                                    System.out.println("Input 1 to Kidnap a Lady");
                                    System.out.println("Input 2 to Talk to Someone");
                                    System.out.println("Input 3 to Order a Drink");
                                    System.out.println("Input 4 to Exit");
                                    System.out.println("============================");
                                    System.out.println("Input: ");
                                    input = scanner.nextLine();
                                    num = Integer.parseInt(input);
                                    System.out.println(""); 
                                    switch (num) {
                                          case (4):
                                                obj.goOut();
                                                return obj;
                                          case (3):
                                                obj.orderADrink(obj.favoriteDrink);
                                                return obj;
                                    }
                              } else if (obj.place instanceof Jail) {
                                    System.out.println(obj.name + " is in " + obj.place.name);
                                    System.out.println("");
                                    System.out.println("Input 0 to Escape");
                                    System.out.println("Input 1 to Stay");
                                       System.out.println("============================");
                                    System.out.println("Input: ");
                                    input = scanner.nextLine();
                                    num = Integer.parseInt(input);
                                    System.out.println("");
                                    switch (num) {
                                          case (0):
                                                if (random.nextInt(2) == 0) {
                                                      obj.escape();
                                                } else {
                                                      System.out.println("You have been caught. You did not manage to escape.");
                                                }
                                                return obj;
                                          case (1):
                                                System.out.println("You were hung for kidnapping the lady.");
                                                return obj;
                                    }
                              }
                              break;
                  }
                  switch (num) {
                        case (1):
                              Lady girl = person.randomLady(list.get(0));
                              obj.kidnappedLady(girl);
                              int gettojail = random.nextInt(2);
                              if (gettojail == 1) {
                                    Sheriff cop = person.randomSherif(list.get(1));
                                    cop.catchABandit(obj, list_places);
                                    System.out.println("You're in prison...");

                                    cop.freeTheLady(girl);
                              }
                              return obj;
                        case (2):
                              if (!obj.place.people.isEmpty()) {
                                    Human someone = person.randomHuman(0, 0, list);
                                    while (someone == obj) {
                                          someone = person.randomHuman(0, 0, list);
                                    }
                                    obj.talkToSomeone(someone);
                              } else {
                                    System.out.println("You are currently alone. You cannot speak to anyone else.");
                              }
                              return obj;
                        default:
                              throw new Exception("unknown action");
                  }
            } catch (Exception ex) {
                  System.err.println(ex.getMessage());
                  System.out.println("You did not enter a number corresponding to an action.");
                  System.out.println("Please try again..");
                  System.out.println("If you want to leave type 'quit' otherwise type something else");
                  return obj;
            }
      }

      /**
        * displays and executes actions available for the character obj
        *
        * @param input 0 for random 1 to select 2 for story
        * @param obj the character doing the action
        * @param list_places list of implemented places
        * @param list list of available characters
        * @return an Indian type character
       */
      public Indian indian(int choice, Indian obj, Places[] list_places,
               ArrayList<ArrayList<ArrayList<Human>>> list) {
            try {
                  int num = 0;
                  System.out.println(obj.getClass());
                  Scanner scanner = new Scanner(System.in);
                  String input;
                  switch (choice) {
                        case 0:
                              num = 0;
                              break;
                        case 1:
                              System.out.println("");
                              System.out.println("Input 1 to Talk to Someone");
                              System.out.println("============================");
                                    System.out.println("Input: ");
                              input = scanner.nextLine();
                              num = Integer.parseInt(input);
                              System.out.println("");
                              break;
                        default:
                              if (obj.place instanceof MainStreet) {
                                    //action dispo street
                                    System.out.println(obj.name + " est sur " + obj.place.name);
                                    System.out.println("");
                                    System.out.println("Input 0 to Enter the Bar");
                                    System.out.println("Input 1 to Talk to Someone");
                                    System.out.println("============================");
                                    System.out.println("Input: ");
                                    input = scanner.nextLine();
                                    num = Integer.parseInt(input);
                                    System.out.println("");
                                    switch (num) {
                                          case (0):
                                                obj.goTo(list_places[0]);
                                                return obj;
                                    }
                              } else if (obj.place instanceof Bar) {
                                    System.out.println(obj.name + " is in " + obj.place.name);
                                    System.out.println("");
                                    System.out.println("Input 0 to Exit");
                                    System.out.println("Input 1 to Talk to Someone");
                                    System.out.println("Input 2 to Order a Drink");
                                         System.out.println("============================");
                                    System.out.println("Input: ");
                                    input = scanner.nextLine();
                                    num = Integer.parseInt(input);
                                    System.out.println("");
                                    switch (num) {
                                          case (3):
                                                obj.goOut();
                                                return obj;
                                          case (2):
                                                obj.orderADrink(obj.favoriteDrink);
                                                return obj;
                                    }
                              } else if (obj.place instanceof Jail) {
                                    System.out.println(obj.name + " is in " + obj.place.name);
                                    return obj;
                              }
                              break;
                  }
                  switch (num) {
                        case (1):
                              if (!obj.place.people.isEmpty()) {
                                    Human someone = person.randomHuman(0, 0, list);
                                    while (someone == obj) {
                                          someone = person.randomHuman(0, 0, list);
                                    }
                                    obj.talkToSomeone(someone);
                              } else {
                                    System.out.println("You are currently alone. You cannot speak to anyone else.");
                              }
                              return obj;
                        default:
                              throw new Exception("unknown action");
                  }
            } catch (Exception ex) {
                  System.err.println(ex.getMessage());
                  System.out.println("You did not enter a number corresponding to an action.");
                  System.out.println("Try again.");
                  System.out.println("If you want to quit type 'quit', otherwise type something else");
                  return obj;
            }
      }

      /**
        * redirects to the function corresponding to the type of man
        *
        * @param input 0 for random 1 to select 2 for story
        * @param man the character that performs the action
        * @param list_places list of implemented places
        * @param list list of available characters
        * @return a character of type Human
       */
      public Human human(int choice, Human man, Places[] list_places,
               ArrayList<ArrayList<ArrayList<Human>>> list) {
            if (man instanceof BanditLady) {
                  BanditLady character = (BanditLady) man;
                  character = banditlady(choice, character, list_places, list);
                  return character;
            }
            if (man instanceof Lady) {
                  Lady character = (Lady) man;
                  character = lady(choice, character, list_places, list);
                  return character;
            }
            if (man instanceof Sheriff) {
                  Sheriff character = (Sheriff) man;
                  character = sherif(choice, character, list_places, list);
                  return character;
            }
            if (man instanceof BadCop) {
                  BadCop character = (BadCop) man;
                  character = badcop(choice, character, list_places, list);
                  return character;
            }
            if (man instanceof Cowboy) {
                  Cowboy character = (Cowboy) man;
                  character = cowboy(choice, character, list_places, list);
                  return character;
            }

            if (man instanceof Bandit) {
                  Bandit character = (Bandit) man;
                  character = bandit(choice, character, list_places, list);
                  return character;
            }
            if (man instanceof Indian) {
                  Indian character = (Indian) man;
                  character = indian(choice, character, list_places, list);
                  return character;
            }
            return man;
      }
}
