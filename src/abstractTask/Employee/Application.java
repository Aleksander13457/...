package abstractTask.Employee;

public class Application {
    public static void main(String[] args) {
        FullTimeJob worker1 = new FullTimeJob(5000, 1000);
        PartTimeJob worker2 = new PartTimeJob(1000);

        SolaryPayoutProcess solaryPayoutProcess = new SolaryPayoutProcess(worker2);
        solaryPayoutProcess.payoutProcess();
    }
}
