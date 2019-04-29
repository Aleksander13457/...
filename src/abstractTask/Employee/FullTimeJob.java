package abstractTask.Employee;

public class FullTimeJob implements Employee {
    private double solary;
    private double bonus;

    public FullTimeJob(double solary, double bonus) {
        this.solary = solary;
        this.bonus = bonus;
    }


    @Override
    public double calculateSolary() {
        return solary + bonus;
    }
}
