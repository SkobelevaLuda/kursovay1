public class Main {

    private static final Employee[] EMPLOYEES = new Employee[10];
    public static void main(String[] args) {
        EMPLOYEES[0] = new Employee("Иванов Николай Иванович", 87_000, 2);
        EMPLOYEES[1] = new Employee("Петров Александр Иванович", 82_000, 1);
        EMPLOYEES[2] = new Employee("Аванесян Олег Сергеевич", 77_000, 2);
        EMPLOYEES[3] = new Employee("Сидов Никита Петрович", 97_000, 3);
        EMPLOYEES[4] = new Employee("Васин Василий Константинович", 87_000, 1);
        EMPLOYEES[5] = new Employee("Бунин Николай Николаевич", 95_000, 4);
        EMPLOYEES[6] = new Employee("Гагарин Илья Николаевич", 99_000, 5);
        EMPLOYEES[7] = new Employee("Дудин Сергей Сергеевич", 91_000, 4);
        EMPLOYEES[8] = new Employee("Елин Игорь Николаевич", 93_000, 5);
        EMPLOYEES[9] = new Employee("Жужин Илья Олегович", 98_000, 3);

        printFullInfo();
    }
    private static void printFullInfo(){
        for (Employee employee: EMPLOYEES){
            System.out.println(employee);
        }
    }
}