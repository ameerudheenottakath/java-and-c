


class Shape{//base class
    String name;

    public void area(){
        System.out.println("display area");
    }

}

class Triangle extends Shape{//sub class
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}

class Circle extends Shape {//sub class
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}
public class Inherit{
    public static void main(String[] args) {
    }
}