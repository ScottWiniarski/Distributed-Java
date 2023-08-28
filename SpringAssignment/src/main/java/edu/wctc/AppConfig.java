package edu.wctc;

import edu.wctc.iface.SalesInput;
import edu.wctc.iface.SalesReport;
import edu.wctc.iface.ShippingPolicy;
import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean
    public SalesInput salesInput(){
        return salesInput();
    }

    @Bean
    public SalesReport salesReport(){
        return salesReport();
    }

    @Bean
    public ShippingPolicy shippingPolicy(){
        return shippingPolicy();
    }
}
