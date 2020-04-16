/**
 * Employee.java - Employee Benefits Management
 * @author Kimberly Bryant
 * @version 1
 */
public class Employee {
    private String name;
    private double baseSalary;
    private int yearsOfExperience;
    private int yearsAtCompany;

    /**
     * Parameterless constructor
     */
    public Employee(){
        name = "Default";
        baseSalary = 30;
        yearsOfExperience = 0;
        yearsAtCompany = 0;
    }

    /**
     * Parameterless constructor
     *@param name A variable of type String
     *@param baseSalary A variable of type double
     *@param yearsOfExperience A variable of type int
     *@param yearsAtCompany A variable of type int
     */
    public Employee(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany){
        this.name = name;
        this.baseSalary = baseSalary;
        this.yearsOfExperience = yearsOfExperience;
        this.yearsAtCompany = yearsAtCompany;
    }

    /**
     * Returns a String containing the employees name
     * @return String containing the employees name
     */
    public String getName() {
        return name;
    }

    /**
     * Accepts a String to set the employees name
     * @param name A variable of type String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns a double of the employees base salary
     * @return Double containing the employees base salary
     */
    public double getBaseSalary() {
        return baseSalary;
    }

    /**
     * Accepts a double to set the employees base salary
     * @param baseSalary A variable of type double
     */
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    /**
     * Returns a int containing the employees years of experience
     * @return Int containing the employees years of experience
     */
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    /**
     * Accepts a int to set the employees years of experience
     * @param yearsOfExperience A variable of type int
     */
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    /**
     * Returns a int containing the employees years at the company
     * @return Int containing the employees years at the company
     */
    public int getYearsAtCompany() {
        return yearsAtCompany;
    }

    /**
     * Accepts a int to set the employees years at the company
     * @param yearsAtCompany A variable of type int
     */
    public void setYearsAtCompany(int yearsAtCompany) {
        this.yearsAtCompany = yearsAtCompany;
    }

    /**
     * Returns the employees name, salary and motto
     * @return A value of data type String
     */
    public String toString(){
        return "Name: " + this.name + ", Salary: $" + this.baseSalary + "k, Motto: " + this.motto();
    }

    /**
     * Returns a generic employee motto
     * @return A value of data type String
     */
    public String motto(){
        return "\"We value our employees.\"";
    }
}