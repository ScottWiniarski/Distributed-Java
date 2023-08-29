package edu.wctc.iface;

import java.io.FileNotFoundException;
import java.util.List;

import edu.wctc.Sale;

public interface SalesInput {
    List<Sale> getSales() throws FileNotFoundException;
}
