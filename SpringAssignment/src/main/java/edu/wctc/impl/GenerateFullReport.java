package edu.wctc.impl;

import edu.wctc.Sale;
import edu.wctc.iface.SalesReport;

import java.util.List;

public class GenerateFullReport implements SalesReport {
    @Override
    public void generateReport(List<Sale> salesList) {
        String saleDetails;
        System.out.println("SALES DETAIL REPORT:");
        System.out.println(" Customer " + " Country " + " Amount " + " Tax " + " Shipping");
        System.out.printf("%-10s %-8s %-8s %-8s %-8s", "Customer", "Country", "Amount", "Tax", "Shipping");
        for (Sale sale : salesList) {
            saleDetails = sale.getSalesText();

            String sections[] = saleDetails.split(",");
            String section1 = sections[0];
            String section2 = sections[1];
            String section3 = sections[2];
            String section4 = sections[3];
            String section5 = sections[4];

            //String modifiedSection3 = String.format("%2f", section3);

            System.out.printf("%-10s %-8s %-8s %-8s %-8s", section1, section2, section3, section4, section5);
            //System.out.printf("%.2f%n", section3);
        }
    }
}
