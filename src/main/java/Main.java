import org.example.Singleton.Builder.Student;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        Builder builder = new Builder();
        builder.setName("Adarsh Raj");
        builder.setAge(24);
        builder.setBatch("May25");
        builder.setGradeYear(2023);

        Student s = new Student(builder);

    }
}