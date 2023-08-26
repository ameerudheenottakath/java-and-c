abstract class Animal {
    //abstract
    abstract void walk();
    //constructor
    Animal(){
        System.out.println("YOu are creating new animal");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
}
class Horse extends Animal{
    //constructor
    Horse(){
        System.out.println("Created a horse");
    }
    public void walk(){
        System.out.println("walk on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}
public class Abstract {

    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
    }
}