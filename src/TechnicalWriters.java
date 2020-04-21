public class TechnicalWriters extends Employee {

    public TechnicalWriters(){
        super();
    }

    public TechnicalWriters(String name, int baseSalary, int yearsOfExperience, int yearsAtCompany){
        super(name, baseSalary, yearsOfExperience, yearsAtCompany, 1);
        this.setYearsAtCompany(yearsAtCompany);
    }

    @Override
    public void setYearsAtCompany(int yearsAtCompany) {
        super.setYearsAtCompany(yearsAtCompany);
        if(yearsAtCompany < 1) setVacationWeeks(0);
        else if(yearsAtCompany == 1) setVacationWeeks(1);
        else  if(yearsAtCompany >= 2) setVacationWeeks(2);
    }

    @Override
    public String motto(){
        return "\"You can always edit a bad page. You can't edit a blank page.\"";
    }
}
