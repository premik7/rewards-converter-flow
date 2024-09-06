public class RewardValue {
    private double cashValue;
    private  double mileValue;

    private static  final double MILES_TO_CASH_RATE=0.0035;

    public RewardValue(int mileValue){
        this.mileValue=mileValue;
        this.cashValue=mileValue*MILES_TO_CASH_RATE;
    }

    public RewardValue(double cashValue) {
        this.cashValue=cashValue;
        this.mileValue=cashValue/MILES_TO_CASH_RATE;
    }

    public double getCashValue(){
        return cashValue;
    }

    public double getMilesValue(){
        return mileValue;
    }
}
