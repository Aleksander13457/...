package abstractTask.Employee;

abstract class SalaryPayout {

    private Employee employee;

    public SalaryPayout(Employee employee) {
        this.employee = employee;
    }

    protected abstract void payout();

    public void payoutProcess(){
        System.out.println("Wypłata w wysokości " + employee.calculateSolary());
        this.payout();

    }
}
