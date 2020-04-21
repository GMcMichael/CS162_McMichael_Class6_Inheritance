public class ProductManagers extends Employee {
    private int companyStock;

    public ProductManagers(){
        super();
    }

    public ProductManagers(String name, int baseSalary, int yearsOfExperience, int yearsAtCompany){
        super(name, baseSalary, yearsOfExperience, yearsAtCompany, 2);
        this.setYearsAtCompany(yearsAtCompany);
    }

    @Override
    public void setYearsAtCompany(int yearsAtCompany) {
        super.setYearsAtCompany(yearsAtCompany);
        if(yearsAtCompany < 1) setVacationWeeks(0);
        else if(yearsAtCompany == 1) setVacationWeeks(3);
        else  if(yearsAtCompany >= 2) setVacationWeeks(4);
        companyStock = yearsAtCompany*100;
    }

    public int getCompanyStock(){
        return companyStock;
    }

    @Override
    public String toString(){
        return super.toString() + ", Stock options: " + getCompanyStock();
    }

    @Override
    public String motto(){
        return "\"There is nothing so useless as doing efficiently that which should not be done at all.\"";
    }

}
