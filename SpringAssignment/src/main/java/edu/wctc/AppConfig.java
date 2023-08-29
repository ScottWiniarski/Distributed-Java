package edu.wctc;

import edu.wctc.iface.SalesInput;
import edu.wctc.iface.SalesReport;
import edu.wctc.iface.ShippingPolicy;
import edu.wctc.impl.FileInput;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("edu.wctc.sales")
public class AppConfig {
    @Bean
    public SalesInput salesInput(){
        return new FileInput();
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
