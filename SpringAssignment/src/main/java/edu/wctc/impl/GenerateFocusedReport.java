package edu.wctc.impl;

import edu.wctc.Sale;
import edu.wctc.iface.SalesReport;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenerateFocusedReport implements SalesReport {
    @Override
    public void generateReport(List<Sale> salesList) {

        // TODO Ask about making the below code more universial and flexible. I've looked up Mashmaps and Collections but I don't
        // TODO understand how to simplify the practice below.

        String saleDetails;
        List<String> countries = new ArrayList<>();
        double usAmount = 0;
        double japanAmount = 0;
        double scotlandAmount = 0;
        double indiaAmount = 0;

        double usTax = 0;
        double japanTax = 0;
        double scotlandTax = 0;
        double indiaTax = 0;

        double usShipping = 0;
        double japanShipping = 0;
        double scotlandShipping = 0;
        double indiaShipping = 0;

        for(Sale sales:salesList){
            saleDetails = sales.getSalesText();

            String sections[] = saleDetails.split(",");
            if(!countries.contains(sections[1])){
                countries.add(sections[1]);
            }

            switch (sections[1]) {
                case "United States":
                    usAmount += Double.parseDouble(sections[2]);
                    usTax += Double.parseDouble(sections[3]);
                    usShipping += Double.parseDouble(sections[4]);
                    break;
                case "Japan":
                    japanAmount += Double.parseDouble(sections[2]);
                    japanTax += Double.parseDouble(sections[3]);
                    japanShipping += Double.parseDouble(sections[4]);
                    break;
                case "Scotland":
                    scotlandAmount += Double.parseDouble(sections[2]);
                    scotlandTax += Double.parseDouble(sections[3]);
                    scotlandShipping += Double.parseDouble(sections[4]);
                    break;
                case "India":
                    indiaAmount += Double.parseDouble(sections[2]);
                    indiaTax += Double.parseDouble(sections[3]);
                    indiaShipping += Double.parseDouble(sections[4]);
                    break;
            }
        }

        System.out.println("SALES SUMMARY REPORT");
        System.out.printf("%-8s %-8s %-8s %-8s", "Country", "Amount", "Tax", "Shipping");

        //System.out.printf("%-8s %-8s %-8s %-8s", countries.get(0), usAmount, usTax, usShipping);
        System.out.printf("%-8s %-8s %-8s %-8s", "United States", usAmount, usTax, usShipping);
        System.out.printf("%-8s %-8s %-8s %-8s", "Japan", japanAmount, japanTax, japanShipping);
        System.out.printf("%-8s %-8s %-8s %-8s", "Scotland", scotlandAmount, scotlandTax, scotlandShipping);
        System.out.printf("%-8s %-8s %-8s %-8s", "India", indiaAmount, indiaTax, indiaShipping);
    }
}
