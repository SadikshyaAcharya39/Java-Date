abstract class Animals {

    abstract void abstractMethod();

    public void sleep() {
        System.out.println("Zzz");
    }
}


     class Cats extends Animals{

         @Override
         void abstractMethod() {
             System.out.println("Cats implementation of abstractMethod");
         }


        public void animalSound(){
            System.out.println("cat says meow meow...");
        }
    }

    class Main{
        public static void main(String[] args) {
            Cats cats = new Cats();
            cats.animalSound();
            cats.abstractMethod();
            cats.sleep();
        }
    }

