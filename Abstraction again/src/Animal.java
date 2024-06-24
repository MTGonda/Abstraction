abstract class Mammal extends Animal {

    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println(getExplicitType() + " ");
        System.out.println( speed.equals("slow")? "walks" : "runs");
    }
    public abstract void shedHair();
}

public abstract class Animal {


    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }
    public abstract void move(String speed); //in abstract methods there is no method body
    public abstract void makeNoise(); // we do not provide any default behaviour to the method
    //we cant use private abstract modifier with abstract methods
    //Abstract classes never gets instatiated, so we have more freedom designing the inside

    public final String getExplicitType(){
        return getClass().getSimpleName() + "(" + type + ")"; // since we are using inheritance we can use this method in other classes involved
    }
}
