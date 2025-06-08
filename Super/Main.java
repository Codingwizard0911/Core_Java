package Super;

public class Main {
    public static void main(String[] args) {
        /*
        Super ==> Refers to parent class [subclass <- superclass],
                    Used in constructors and method overriding
                    Calls the parent constructor to initialize attributes
         */
        Person person = new Person("Tom", "Holland");
        Student student = new Student("Tom", "Holland", 8.5);
        Employee employee = new Employee(null, null, 0);
        person.showname();
        student.showGPA();
        employee.showSalary();

    }
    
}
