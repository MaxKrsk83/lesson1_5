public class Person {
    private String fio;
    private String position;
    private String email;
    private String phone;
    private int salary;
    public int age;

    public Person(String fio, String position, String email, String phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", salary='" + salary + '\'' +
                ", age=" + age +
                '}';
    }
}
