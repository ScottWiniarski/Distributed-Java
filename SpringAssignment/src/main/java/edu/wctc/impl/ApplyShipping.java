package edu.wctc.impl;

import edu.wctc.Sale;
import edu.wctc.iface.ShippingPolicy;

public class ApplyShipping implements ShippingPolicy {
    @Override
    public void applyShipping(Sale sale) {
        double shippingFees = .00;

        Sale formattedSale;
        formattedSale = sale;

        String modifyThis = formattedSale.getSalesText();

        String[] sections = modifyThis.split(",");
        String section1 = sections[0];
        String section2 = sections[1];
        String section3 = sections[2];
        String section4 = sections[3];

        // turns a string into a double
        double sectionAmount = Double.parseDouble(section3);

        double shippingAmount = (sectionAmount * shippingFees);

//        BigDecimal bd = BigDecimal.valueOf(shippingAmount);
//        bd = bd.setScale(shippingAmount, RoundingMode.HALF_UP);

        //creates shipping costs as a double then converts to string
        //String section5 = String.format("%.2f" ,Double.toString( (sectionAmount * shippingFees)) ) ;

        String section5 = Double.toString(sectionAmount * shippingFees);
        //double newAmount = (sectionAmount += (sectionAmount * shippingFees));

        //String.format("%.2f",newSection3);
        // TODO remember to format the new value to 2 decimal places when printing. I.E: $190.95 with .05 shipping fees becomes $200.4975
        section3 = Double.toString(sectionAmount);

        String modifiedSale = String.join(",",sections) + ("," + section5);
        formattedSale.setSalesText(modifiedSale);


    }
}
