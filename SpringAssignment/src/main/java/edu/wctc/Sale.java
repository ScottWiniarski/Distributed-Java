package edu.wctc;

public class Sale {

    private String salesText;
    public Sale(String text){
        this.salesText = text;
    }

    public String getSalesText(){
        return salesText;
    }

    public void setSalesText(String text){
        this.salesText = text;
    }
}
