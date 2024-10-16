public class StudentTest {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Student s = new Student();
        s.name = "John";
        s.age = 23;
        System.out.println(s.name + ", " + s.age); 
        s.sayHello();
        s.displayName();
        s.displayAge();
        
    }
    
    
}
