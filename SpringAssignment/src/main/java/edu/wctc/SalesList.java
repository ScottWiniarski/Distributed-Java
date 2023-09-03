package edu.wctc;

import java.util.ArrayList;
import java.util.List;
import edu.wctc.Sale;

public class SalesList {
    private static List<Sale> sales = new ArrayList<>();

    public static List<Sale> getSalesList(){
        return sales;
    }

    public static void addSalesList(Sale newSale){
        sales.add(newSale);
    }



}
