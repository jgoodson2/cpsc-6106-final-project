public class PieceWorker extends Employee {

    public PieceWorker(String first, String last, String ssn) {
        super(first, last, ssn);
    }

    @Override
    public double earnings() {
        return 0;
    }
}
