public class Main {

    public static void main(String[] args) {
        // write your code here

        animal[] animalArray = {
                new cat(),
                new cat(),
                new dog(),
                new cat(), };

        for (animal n : animalArray) {
            System.out.println(n.makeSound());
        }
    }
}
abstract class animal {
    public abstract String makeSound();
}

class cat extends animal {
    @Override
    public String makeSound() {
        return "Meow";
    }
}

class dog extends animal
{
    @Override
    public String makeSound() {
        return "Woof";
    }
}
