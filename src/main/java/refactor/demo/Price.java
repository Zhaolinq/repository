package refactor.demo;

public abstract class Price {

    abstract int getPriceCode();
    abstract double getCharge(int dayRented);
    abstract int getFrequestRenterPoint(int dayRented);
}
