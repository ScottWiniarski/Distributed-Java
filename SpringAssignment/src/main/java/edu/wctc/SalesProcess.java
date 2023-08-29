package edu.wctc;
import java.util.List;
import edu.wctc.iface.SalesInput;
import edu.wctc.iface.SalesReport;
import edu.wctc.iface.ShippingPolicy;
import edu.wctc.impl.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SalesProcess {
    private SalesInput input;
    private SalesReport report;
    private ShippingPolicy policy;
    @Autowired
    public SalesProcess(SalesInput input, SalesReport report, ShippingPolicy policy ){
    this.input = input;
    this.report = report;
    this.policy = policy;

    System.out.println("Sales Process Started");

    }

    public void generateReport(){
        System.out.println("Running Report");
//        List<Sale> allSales = SalesInput.getSales();
//        for(Sale aSale : allSales){
//
//        }
            //shippingPolicy.applyShipping(aSale);
        //salesReport.generateReport(allSales);
    }
}
