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
        Employee minSalaru=fullMinSalaru();
        System.out.println(" Сотрудник с минимальной ЗП: " +minSalaru);
        Employee maxSalaru=fullMaxSalaru();
        System.out.println(" Сотрудник с максимальной ЗП: " +maxSalaru);
        printFullNameInfo();

        int totalSalary = getTotalSalarys();
        System.out.println(" Сумма зарплат: " + totalSalary);

        double averegeSalary=findSalary();
        System.out.println(" Средняя зарплата: " + averegeSalary);
    }
    private static void printFullInfo(){
        for (Employee employee: EMPLOYEES){
            System.out.println(employee);
        }
    }
    private static int getTotalSalarys(){
        int sum = 0;
        for (Employee employee: EMPLOYEES){
            if(employee!=null){
                sum=sum+employee.getSalary();
            }
        }
        return sum;
    }
    private static Employee fullMinSalaru() {
        int min = Integer.MAX_VALUE;
        Employee minSalaru = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                minSalaru = employee;
            }
        }
        return minSalaru;
    }

    private static Employee fullMaxSalaru() {
        int max = Integer.MIN_VALUE;
        Employee maxSalaru = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                maxSalaru = employee;
            }
        }
        return maxSalaru;
    }

    private static double findSalary(){
        int count = 0;
        for (Employee employee: EMPLOYEES){
            if (employee!=null){
                count++;
            }
        }
        if (count!=0){
            return (double) getTotalSalarys()/count;
        }
        return 0;
    }
    private static void printFullNameInfo() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee.getFio());
        }
    }
}