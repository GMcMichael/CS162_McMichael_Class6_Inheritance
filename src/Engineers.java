public class Engineers extends Employee {

    private int signBonus;

    public Engineers(){
        super();
    }

    public Engineers(String name, int baseSalary, int yearsOfExperience, int yearsAtCompany){
        super(name, baseSalary, yearsOfExperience, yearsAtCompany, 1.5);
        this.setYearsAtCompany(yearsAtCompany);
        this.setYearsOfExperience(yearsOfExperience);
    }

    @Override
    public void setYearsAtCompany(int yearsAtCompany) {
        super.setYearsAtCompany(yearsAtCompany);
        if(yearsAtCompany < 1) setVacationWeeks(0);
        else if(yearsAtCompany == 1) setVacationWeeks(2);
        else  if(yearsAtCompany >= 2) setVacationWeeks(3);
    }

    @Override
    public void setYearsOfExperience(int yearsOfExperience){
        super.setYearsOfExperience(yearsOfExperience);
        if(yearsOfExperience < 5) signBonus = 5;
        else signBonus = 10;
    }

    public int getSignBonus(){
        return signBonus;
    }

    @Override
    public String toString(){
        return super.toString() + ", Sign-on bonus: $" + getSignBonus() + "k";
    }

    @Override
    public String motto(){
        return "\"To the optimist, the glass is half full.To the pessimist, the glass is half empty.To the engineer, the glass is twice as big as it needs to be.\"";
    }
}
