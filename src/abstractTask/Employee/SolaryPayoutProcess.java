package abstractTask.Employee;

public class SolaryPayoutProcess extends SalaryPayout{
    public SolaryPayoutProcess(Employee employee) {
        super(employee);
    }

    @Override
    protected void payout() {
        System.out.println("Wysłano pieniądze do pracownika");
    }
}
