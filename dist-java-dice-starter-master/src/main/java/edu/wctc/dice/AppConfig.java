package edu.wctc.dice;


import edu.wctc.dice.iface.GameInput;
import edu.wctc.dice.iface.GameOutput;
import edu.wctc.dice.impl.GuiInput;
import edu.wctc.dice.impl.GuiOutput;
import edu.wctc.dice.impl.PopupOutput;
import edu.wctc.dice.impl.PopupInput;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc.dice")
public class AppConfig {
    @Bean
    public GameOutput gameOutput(){
        // return a new ConsoleOutput();
        return new GuiOutput();
    }
    @Bean
    public GameInput gameInput(){
        return new GuiInput();
    }


}
