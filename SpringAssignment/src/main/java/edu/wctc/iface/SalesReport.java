package edu.wctc.iface;
import edu.wctc.impl.Sale;

import java.util.List;

public interface SalesReport {
    void generateReport(List<Sale> salesList);
}
