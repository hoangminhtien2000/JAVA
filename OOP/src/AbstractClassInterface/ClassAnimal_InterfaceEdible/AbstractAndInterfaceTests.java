package AbstractClassInterface.ClassAnimal_InterfaceEdible;

import AbstractClassInterface.ClassAnimal_InterfaceEdible.animal.Animal;
import AbstractClassInterface.ClassAnimal_InterfaceEdible.animal.Chicken;
import AbstractClassInterface.ClassAnimal_InterfaceEdible.animal.Tiger;
import AbstractClassInterface.ClassAnimal_InterfaceEdible.edible.Edible;
import AbstractClassInterface.ClassAnimal_InterfaceEdible.fruit.Apple;
import AbstractClassInterface.ClassAnimal_InterfaceEdible.fruit.Fruit;
import AbstractClassInterface.ClassAnimal_InterfaceEdible.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {

        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
            if (animal instanceof Tiger) {
                Edible edibler = (Tiger) animal;
                System.out.println(edibler.howToEat());
            }
        }

        Fruit[]fruits=new Fruit[2];
        fruits[0]=new Apple();
        fruits[1]=new Orange();
        for (Fruit fruit:fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
