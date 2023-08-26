 class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("write something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name ; //properties
    int age;

    //function
public void printInfo(){
    System.out.println(this.name);
    System.out.println(this.age);
}
//constructor with out parameter
// Student(){
//     System.out.println("Constructor Called");
// }
//constructor with parameter
Student(String name,int  age){
    this.name = name;
    this. age=age;
    
}
//copy constructor
Student(Student s2){
    this.name = s2.name;
    this.age = s2.age;
    
}

}

public class Oops{
    public static void main(String[] args) {
        // Pen pen1 =new Pen();
        // pen1.color = "blue";
        // pen1.type = " jell";
        
        // Pen pen2 = new Pen();
        // pen2.color = "black";
        // pen2.type = "ballpoint";

        // pen1.printColor();
        // pen2.printColor();

       
        Student s1 = new Student("amen", 25);
        Student s2 = new Student(s1);

        s1.printInfo();
        s2.printInfo();
    }
}