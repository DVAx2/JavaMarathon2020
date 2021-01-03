package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Марья Ивановна", "Биология");
        Student student = new Student("Алексей");
        teacher.evaluate(student.getName());
        teacher.info();
    }
}
