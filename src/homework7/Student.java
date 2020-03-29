package homework7;

public class Student {
    private String name;
    private String surname;
    public int age; // This field is public because it's mutable

    Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // Method to show info in console
    public void show() {
        System.out.printf("Name of the student: %s \t Surname of the student: %s \t Age of the student %d", name, surname, age);
    }
}
