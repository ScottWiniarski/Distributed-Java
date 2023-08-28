package edu.wctc;

import edu.wctc.iface.SalesInput;
import edu.wctc.iface.SalesReport;
import edu.wctc.iface.ShippingPolicy;
import org.springframework.stereotype.Component;

@Component
public class SalesProcess {
    private SalesInput input;
    private SalesReport report;
    private ShippingPolicy policy;

    public SalesProcess(SalesInput input, SalesReport report, ShippingPolicy policy ){
    this.input = input;
    this.report = report;
    this.policy = policy;

    }

    public void generateReport(){
        List<Sale> allSales = salesInput.getSales();
        for(Sale aSale : allSales)
            shippingPolicy.applyShipping(aSale);
        salesReport.generateReport(allSales);
    }
}
