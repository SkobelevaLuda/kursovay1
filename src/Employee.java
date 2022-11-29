public class Employee {
    private static int idGenerator=1;

    private int id;
    private String fio;
    private int salary;
    private int department;

    public Employee (String fio, int salary, int department){
        this.id=idGenerator ++;
        this.fio=fio;
        this.department=department;
        this.id=id;
    }

    private int year = 2018;
    private static Employee[] employeesArr = new Employee[20];
    private static int index = 0; // 2
}
