public class PieceWorker extends Employee {

    /*Class PieceWorker should contain two private instance variables; wage (to store the employee’s wage per piece, a
    double precision floating point number) and pieces (to store the number of pieces produced).*/
    private double wage;
    private int pieces;

    //Provide accessors and mutators for the private instance variables.
    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = (wage < 0.0) ? 0.0 : wage;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = (pieces < 0) ? 0 : pieces;
    }

    public PieceWorker(String first, String last, String ssn, double wage, int pieces) {
        super(first, last, ssn);
        this.setWage(wage);
        this.setPieces(pieces);
    }

    /*Provide a concrete implementation of method earnings in class PieceWorker that calculates and returns the
        employee’s earnings by multiplying the number of pieces produced by the wage per piece.*/
    @Override
    public double earnings() {
        return 0;
    }

    public String toString() {
        return String.format("piece worker: %s\n%s: $%,.2f; %s: %d"
                , super.toString(), "wage per piece", getWage(), "pieces produced", getPieces()
        );
    }
}
