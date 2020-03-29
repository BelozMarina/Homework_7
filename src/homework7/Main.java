package homework7;

public class Main {
    public static void main(String[] args) {
        Student st = new Student("Vaska", "Vosnik", 25);
        st.show();
        System.out.println("\n -------------------------------");


        Teacher tch = new Teacher();
        tch.setName("Maria");
        tch.setSurname("Ivanova");
        tch.setAge(26);
        System.out.println("Name of the teacher: " + tch.getName() + "\t Surname of the teacher: " + tch.getSurname() + "\t Age of the teacher: " + tch.getAge());

    }
}
