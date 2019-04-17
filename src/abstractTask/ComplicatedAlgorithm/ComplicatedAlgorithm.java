package abstractTask.ComplicatedAlgorithm;

abstract class ComplicatedAlgorithm {

    abstract protected void firstMethodToExecute();

    abstract protected void secondMethodToExecute();

    private void thirdMethodToExecute() {
        System.out.println("This is third method to execute!");
    }

    private void fourthMethodToExecute() {
        System.out.println("This is fourth method to execute.");
    }

    public void run() {
        this.firstMethodToExecute();
        this.secondMethodToExecute();
        this.thirdMethodToExecute();
        this.fourthMethodToExecute();
    }

}

class ComplicatedAlgorithmRunner extends ComplicatedAlgorithm {

    protected void firstMethodToExecute() {
        System.out.println("This is first method to execute");
    }

    protected void secondMethodToExecute() {
        System.out.println("This is second method to execute");
    }

    @Override
    public void run() {
        this.firstMethodToExecute();
        this.secondMethodToExecute();
    }

}

class Application {

    public static void main(String args[]) {

        ComplicatedAlgorithmRunner runner = new ComplicatedAlgorithmRunner();

        runner.run();

    }

}