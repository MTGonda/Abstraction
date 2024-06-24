import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       // Animal animal = new Animal("animal","big",100); this code won't compile beacuse animal is an abstract class
        Dog dog = new Dog("Husky","big",50);
        dog.makeNoise();
        doAnimalStuff(dog);
        ArrayList<Animal> animals = new ArrayList<>();// making ArrayList the type of abstract class lets us use the arrayList for all the types this class is being extended with
        animals.add(new Dog("Border Coli","big",100));
        animals.add(new Fish("Shark","big",400));
        animals.add(new Fish("Barracuda","big",50));
        animals.add(new Dog("Pug","small",20));
        animals.add(new Horse("Horse","large",1000 ));

        for(Animal animal : animals){
            doAnimalStuff(animal);
            if(animal instanceof Mammal currentMAmmal){
                currentMAmmal.shedHair();
            }
        }
    }
    private static void doAnimalStuff(Animal animal){ // we can use abstract classes in methods
        animal.makeNoise();
        animal.move("slow");
    }
}