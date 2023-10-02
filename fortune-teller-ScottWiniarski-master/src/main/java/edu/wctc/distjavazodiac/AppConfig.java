package edu.wctc.distjavazodiac;


import edu.wctc.distjavazodiac.repos.FortuneCrudRepo;
import edu.wctc.distjavazodiac.repos.MonthCrudRepo;
import edu.wctc.distjavazodiac.service.*;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public MonthListService monthListService(MonthCrudRepo repo) {
        return new BasicMonthListService(repo);
    }

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public HoroscopeService horoscopeService(ZodiacService zodiacService, FortuneCrudRepo fortuneRepository) {
        return new RandomHoroscopeService(zodiacService, fortuneRepository  );
    }
}
