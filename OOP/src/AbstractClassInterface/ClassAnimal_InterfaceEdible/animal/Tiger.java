package AbstractClassInterface.ClassAnimal_InterfaceEdible.animal;

import AbstractClassInterface.ClassAnimal_InterfaceEdible.edible.Edible;

public class Tiger extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Tiger: roarrrr!";
    }

    @Override
    public String howToEat() {
        return "could be meat";
    }
}
