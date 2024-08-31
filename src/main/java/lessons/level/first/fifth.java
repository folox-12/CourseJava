package lessons.level.first;

/*
    1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    2. Конструктор класса должен заполнять эти поля при создании объекта.
    3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в
    консоль.
    4. Создать массив из 5 сотрудников.
    Пример:
    Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
    persArray[0] = new Person("Ivanov Ivan", "Engineer", "i​vivan@mailbox.com"​, "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
    persArray[1] = new Person(...);
    ...
    persArray[4] = new Person(...);
    5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */

public class fifth {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Ivanov Ivan Ivanovich", "developer", "email@ya.ru", "9988", 19, 38),
                new Employee("Petrov Ivan Ivanovich", "developer", "email@ya.ru", "9988", 12, 45),
                new Employee("Sidorov Ivan Ivanovich", "developer", "email@ya.ru", "9988", 11, 41),
                new Employee("Sinicin Ivan Ivanovich", "developer", "email@ya.ru", "9988", 10, 28),
                new Employee("Drozdov Ivan Ivanovich", "developer", "email@ya.ru", "9988", 52, 33),
        };

        for (Employee employee : employees) {
            if (employee.age > 40) {
                System.out.println(employee);
            }
        }
    }

}

class Employee {
    String FIO, position, email, telephoneNumber;
    int salary, age;

    public Employee(String FIO, String position, String email, String telephoneNumber, int salary, int age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.salary = salary;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "FIO='" + FIO + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
