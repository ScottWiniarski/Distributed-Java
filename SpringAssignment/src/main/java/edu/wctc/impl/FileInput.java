package edu.wctc.impl;

import edu.wctc.Sale;
import edu.wctc.SalesList;
import edu.wctc.iface.SalesInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileInput implements SalesInput {

    Sale tempSale = new Sale("");

    @Override
    public void fillSales() throws FileNotFoundException {
        try{
            File myObj = new File("sales.txt");
            Scanner myReader = new Scanner(myObj);

            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                tempSale.setSalesText(data);
                //System.out.println(tempSale);
                SalesList.addSalesList(tempSale);
            }
            myReader.close();
        }
        catch(FileNotFoundException e){
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
    }
}
