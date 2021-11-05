public class Main {
    public static void main(String[] args) {
        Person [] persons = new Person[5];
        persons[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persons[1] = new Person("Ivanov Кирилл", "программист", "ivivan@mailbox.com", "892318312", 40000, 41);
        persons[2] = new Person("Ivanov Максим", "дворник", "ivivan@mailbox.com", "892312312", 50000, 20);
        persons[3] = new Person("Ivanov Артем", "волшебник", "ivivan@mailbox.com", "892312312", 60000, 38);
        persons[4] = new Person("Ivanov Андрей", "директор", "ivivan@mailbox.com", "892312312", 70000, 45);
        for (Person person : persons) {
            if (person.age > 40) {
                System.out.println(person);
            }
        }
    }
}
