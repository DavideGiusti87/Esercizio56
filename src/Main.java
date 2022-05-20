/*
Polymorphism 02
Exercise: Polymorphism 2

define a class Animal that has:
an instance variable animalName
a constructor that instantiate animalName
a method animalSound() that prints default animal sound
define a subclass Lion
define a subclass Cow
achieve polymorphism by using method overriding on animalSound(), printing the right sounds
define a tester class where you:
create an Animal object
create a Lion object
create a Cow object
executes the animalSound() method on all the 3 objects
 */
public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Lion lion = new Lion();
        Cow cow = new Cow();

        animal.animalName = "animal";
        lion.animalName = "lion";
        cow.animalName = "cow";

        animal.animalSound();
        lion.animalSound();
        cow.animalSound();

    }
}
