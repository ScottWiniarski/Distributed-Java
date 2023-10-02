package edu.wctc.distjavazodiac;

import edu.wctc.distjavazodiac.repo.FortuneRepository;
import edu.wctc.distjavazodiac.repo.MonthRepository;
import edu.wctc.distjavazodiac.service.*;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public MonthListService monthListService(MonthRepository repo) {
        return new DBMonthListService(repo);
    }

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public HoroscopeService horoscopeService(ZodiacService zodiacService, FortuneRepository fortuneRepository) {
        return new DBRandomHoroscopeService(zodiacService, fortuneRepository);
    }
}
