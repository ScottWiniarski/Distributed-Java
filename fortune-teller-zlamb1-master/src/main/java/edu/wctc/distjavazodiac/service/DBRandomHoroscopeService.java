package edu.wctc.distjavazodiac.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.wctc.distjavazodiac.entity.Birthday;
import edu.wctc.distjavazodiac.entity.Fortune;
import edu.wctc.distjavazodiac.entity.Horoscope;
import edu.wctc.distjavazodiac.repo.FortuneRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DBRandomHoroscopeService implements HoroscopeService {
    private List<Fortune> fortunes = new ArrayList<>();
    private final ZodiacService zodiacService;
    private final FortuneRepository fortuneRepository;

    @Autowired
    public DBRandomHoroscopeService(ZodiacService zodiacService, FortuneRepository fortuneRepository) {
        this.zodiacService = zodiacService;
        this.fortuneRepository = fortuneRepository;
    }

    @Override
    public Horoscope getHoroscope(Birthday birthday) {
        String sign;
        if (birthday.getZodiacType().toLowerCase().startsWith("w")) {
            sign = zodiacService.getWesternZodiacSign(birthday);
        } else {
            sign = zodiacService.getEasternZodiacSign(birthday);
        }

        Horoscope hscope = new Horoscope();
        hscope.setSign(sign);

        int randomIndex = (int) (Math.random() * fortunes.size());
        hscope.setHoroscope(fortunes.get(randomIndex).getText());
        return hscope;
    }

    @PostConstruct
    public void initHoroscopes() {
        fortuneRepository.findAll().forEach(fortunes::add);
    }
}
