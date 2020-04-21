import java.util.ArrayList;

public class EmployeeManager {

    private ArrayList<Employee> employees = new ArrayList<Employee>();

    public ArrayList<Employee> getEmployees(){
        return  employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }

    public void displayEmployees(){
        for (Employee e: employees) {
            System.out.println(e.toString());
        }
    }

    public void displaySpecificInfo(){
        for (Employee e: employees) {
            String str = e.getClass().getName();
            String output = "Name: " + e.getName() + ", Job: " + str + ", Vacation days: " + e.getVacationDays();
            switch (str){
                case "TechnicalWriters":
                    break;
                case "Engineers":
                    output += ", Sign-on bonus: $" + ((Engineers)e).getSignBonus() + "k";
                    break;
                case "ProductManagers":
                    output += ", Stock options: " + ((ProductManagers)e).getCompanyStock();
                    break;
            }
            System.out.println(output);
        }
    }

}
