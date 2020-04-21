public class Main {

    public static void main(String[] args){
        EmployeeManager employeeManager = new EmployeeManager();

        //Employee employee = new Employee();
        TechnicalWriters technicalWriters = new TechnicalWriters("Jan", 30, 2, 4);
        Engineers engineers = new Engineers("Joe", 30, 7, 5);
        ProductManagers productManagers = new ProductManagers("Sue", 30, 5, 1);

        /*System.out.println(employee.toString());
        System.out.println(technicalWriters.toString());
        System.out.println(engineers.toString());
        System.out.println(productManagers.toString());
        System.out.println();*/

        employeeManager.addEmployee(technicalWriters);
        employeeManager.addEmployee(engineers);
        employeeManager.addEmployee(productManagers);

        employeeManager.displayEmployees();
        System.out.println();
        employeeManager.displaySpecificInfo();
    }
}
