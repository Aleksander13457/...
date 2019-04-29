package abstractTask.Employee;

public class PartTimeJob implements Employee {
    private final double prise = 5;
    private int howManyItems;

    public PartTimeJob(int howManyItems) {
        this.howManyItems = howManyItems;
    }

    @Override
    public double calculateSolary() {
        return prise * howManyItems;
    }
}
