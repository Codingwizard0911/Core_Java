package AnonymousClass;

import Polymorphism.RuntimePM.Dog;

public class Main {
    public static void main(String[] args) {
        /*
         * Anonymous Class ==>A class that doesn't have a name ,cannot be reused
         *                    A custom behavior without having to create a new class
         *                    Often used for onetime uses (timertask, runnable, callbacks)
         */

         Dog dog2 = new Dog();
         Dog dog1=new Dog(){
            /*Anonymous class */
            @Override
           public  void speak()
            {
                System.out.println("The Scooby Doo can \"Ruh Roh\"");
            }
         };
        dog2.speak();
        dog1.speak();
    }
    
}
