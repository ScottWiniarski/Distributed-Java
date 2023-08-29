package edu.wctc.iface;

import edu.wctc.impl.Sale;
public interface ShippingPolicy {
    void applyShipping(Sale sale);
}
