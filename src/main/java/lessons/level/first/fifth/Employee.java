package lessons.level.first.fifth;

public class Employee {
    private String fio, position, email, telephoneNumber;
    private int salary, age;

    public Employee(String fio, String position, String email, String telephoneNumber, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
