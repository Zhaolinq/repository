package refactor.demo;

public class ChildrenPrice extends Price {

    @Override
    int getPriceCode() {
        return Movie.CHILDRENS;
    }

    double getCharge(int dayRented) {
        double result = 1.5;
        if(dayRented > 3) {
            result += (dayRented - 3) * 1.5;
        }
        return result;
    }

    int getFrequestRenterPoint(int dayRented) {
        return 1;
    }

}
