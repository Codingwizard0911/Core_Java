package Interface;

public class Main {
    public static void main(String[] args) {
        /*
         * Interface  ==> A blueprint for a class that specifies a set of abstract methods to an abstract
         * that implementing classes must define 
         * support multiple inheritance like behaviour
         */

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();
        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();
    }
    
}
