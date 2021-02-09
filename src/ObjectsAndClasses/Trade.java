package ObjectsAndClasses;

public class Trade {
    private String _id;
    private String _symbol;
    private int _quantity;
    private double _price;

    public Trade(String a,String b,int c,double d){
        _id=a;_symbol=b;_quantity=c;_price=d;
    }
    public Trade(String a,String b,int c){
        _id=a;_symbol=b;_quantity=c;
    }


    public void toStrings(){
        System.out.println("ID + " + _id +" Symbol " + _symbol +" Quantity "+ _quantity + " Price" + _price);
    }

    public void setPrice(double price){
        if(price > 0){
            _price=price;
        }
    }

}
