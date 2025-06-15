/*3. Animal Sound System

Instructions:

    Create a base class Animal with method makeSound().
    Subclasses: Dog, Cat, Cow override makeSound() to print specific animal sounds.
    Write a main method that stores different animals in an array and uses polymorphism to call makeSound() on each.
    File: AnimalSounds.java.
*/

class Animal {
    public void makeSound(){
        System.out.println("Making Sounds");
    }
}
class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Bark Bark");
    }
}
class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Meow Meow");
    }
}
class Cow extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Moo Moo");
    }
}
public class AnimalSounds {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Cow();

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}