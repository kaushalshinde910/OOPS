//Question: Create a base class Animal with a method makeSound(). 
//Create a derived class Dog that overrides the makeSound() method.
//inheritance
//2nd class & object program.
class Animal {
    void makesound() {
        System.out.println("Animal like Dog makes a sound");
    }
}

public  class Dog  extends Animal  {
    @Override
    void makesound()
    {
        System.out.println("barks");
    }
    void eat()
    {
        System.out.println("Dog is eating");
    }

public static void main(String[] args)
 {
    Animal myAnimal=new Animal();
    myAnimal.makesound();
    Dog myDog=new Dog();
    myDog.makesound();
    myDog.eat();
     
 }
}

    

