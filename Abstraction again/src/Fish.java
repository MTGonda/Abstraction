public class Fish extends Animal{
    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed.equals("slow")){
            System.out.println(getExplicitType() + " swimming");
        }else{
            System.out.println(getExplicitType() + " darting");
        }
    }

    @Override
    public void makeNoise() {
        if(type=="Shark"){ // thanks to protected modifier in Animal class I can use type to specify the noise
            System.out.println("Rawr");
        }else{
            System.out.println("Splash");
        }
    }
}
