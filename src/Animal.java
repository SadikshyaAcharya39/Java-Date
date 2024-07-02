 class Animal {

    public void animalSound() {
        System.out.println("The animal makes a sound!!!");
    }
  }

    class Cat extends  Animal{
    public void animalSound(){
        System.out.println("The cat says: MEOW MEOW !!!");
    }

        public static void main(String[] args) {
            Animal animal = new Animal();
            animal.animalSound();
            Cat cat = new Cat();
            cat.animalSound();



        }



}
