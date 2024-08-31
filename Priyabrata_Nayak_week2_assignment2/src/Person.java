public class Person {
   
    private String name;
    private int age;

   
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

   
    public void displayName() {
        System.out.println("Name: " + name);
    }

    
    public void displayAge() {
        System.out.println("Age: " + age);
    }

   
    public static void main(String[] args) {
        
        Person person = new Person("munna nayak", 23);

        
        person.displayName(); 
        person.displayAge();  
    }
}
