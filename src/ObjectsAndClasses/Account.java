package ObjectsAndClasses;

public class Account {
    private double _totalTrades;

    public Account(){}

    public void setTotalTrades(double trades){
        _totalTrades=trades;
    }
    public double getTotalTrades(){
        return _totalTrades;
    }
}
