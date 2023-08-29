package edu.wctc.impl;

import edu.wctc.iface.SalesInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileInput implements SalesInput {
    List<Sale> fileText = new ArrayList<>();
    Sale tempSale = new Sale("");

    @Override
    public List<Sale> getSales() throws FileNotFoundException {
        try{
            File myObj = new File("sales.txt");
            Scanner myReader = new Scanner(myObj);

            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                tempSale.setSalesText(data);
                System.out.println(tempSale);

                System.out.println(data);
            }
            myReader.close();
        }
        catch(FileNotFoundException e){
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
        return fileText;
    }
}
