class Student{
    //object
    String name ;
    //static
    static String school;
    public static void changeSchool(){
        school = "newSchool";
    }
}




public class Static 
// this is class any names 
{
    public static void main(String[] args) {
        //static
        Student.school = "ABC";
        Student student1 = new Student();
        student1.name = "Ameer";
        System.out.println(Student.school);
    }
}
