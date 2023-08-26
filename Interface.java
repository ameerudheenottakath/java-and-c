// interface is pure abstraction

interface Animal{
    int eyes =2;
    void walk();
}
interface Herbivore{

}
class Horse implements Animal,Herbivore{
    public void walk(){
        System.out.println("walk on 4 legs");
    };
}
public class Interface {

    public static void main(String args[]){
        Horse horse = new Horse();
        horse.walk();
    }
}
