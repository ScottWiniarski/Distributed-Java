package edu.wctc.impl;

import edu.wctc.Sale;
import edu.wctc.SalesList;
import edu.wctc.iface.SalesInput;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleInput implements SalesInput {

    @Override
    public void fillSales() throws FileNotFoundException {
        String response = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Sales information: 'Q' to quit");
        while(!response.equals("Q")){
            response = scanner.nextLine();
            Sale consoleSale = new Sale(response);
            SalesList.addSalesList(consoleSale);
        }
    }
}
