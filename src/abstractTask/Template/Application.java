package abstractTask.Template;

public class Application {
    public static void main(String args[]) {

        FixedSalaryEmployee employee = new FixedSalaryEmployee(2000.0);

        SalaryPayoutProcessor processor = new SalaryPayoutProcessor(employee);
        processor.processPayout();

    }
}
