package Student;

public class Constructor {
    public static void main(String[] args) {
        Student student1 = new Student("John", 20, "Computer Science");
        Student student2 = new Student("Jane", 21, "Mathematics");

        System.out.println(student1.name + " is " + student1.age + " years old and studies " + student1.course);
        System.out.println(student2.name + " is " + student2.age + " years old and studies " + student2.course);
    }
}
