public class Employee {
    private static int idGenerator=1;

    private final int id;
    private final String fio;
    private int salary;
    private int department;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public Employee (String fio, int salary, int department){
        this.id=idGenerator ++;
        this.fio=fio;
        this.department= department;
        this.salary=salary;

    }
    @Override
    public String toString(){
        return "id: " + id+ " ФИО: " +fio+ " Отдел: " + department+ " ЗП "+salary;
    }

}
