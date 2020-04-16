public class TechnicalWriters extends Employee {
    private int vacationWeeks;

    public TechnicalWriters(){
        super();
    }

    public TechnicalWriters(String name, int baseSalary, int yearsOfExperience, int yearsAtCompany){
        super(name, baseSalary, yearsOfExperience, yearsAtCompany);
        this.setYearsAtCompany(yearsAtCompany);
    }

    @Override
    public void setYearsAtCompany(int yearsAtCompany) {
        super.setYearsAtCompany(yearsAtCompany);
        if(yearsAtCompany < 1) vacationWeeks = 0;
        else if(yearsAtCompany == 1) vacationWeeks = 1;
        else  if(yearsAtCompany >= 2) vacationWeeks = 2;
    }

    @Override
    public String toString(){
        return super.toString() + ", Vacation days: " + (vacationWeeks*7);
    }

    @Override
    public String motto(){
        return "\"You can always edit a bad page. You can't edit a blank page.\"";
    }
}
