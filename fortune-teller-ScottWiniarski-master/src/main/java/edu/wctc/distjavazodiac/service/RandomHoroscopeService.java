package edu.wctc.distjavazodiac.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.wctc.distjavazodiac.entity.Birthday;
import edu.wctc.distjavazodiac.entity.Fortune;
import edu.wctc.distjavazodiac.entity.Horoscope;
import edu.wctc.distjavazodiac.repos.FortuneCrudRepo;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Random horoscopes from https://cafeastrology.com/dailyhoroscopesall-tomorrow.html
 */
@Service
public class RandomHoroscopeService implements HoroscopeService {

    private final FortuneCrudRepo fortuneRepo;
//    @Value("classpath:fortunes.json")
//    private Resource fortunes;
    private List<Fortune> allFortunes = new ArrayList<>();
    private final ZodiacService zodiacService;

    @Autowired
    public RandomHoroscopeService( ZodiacService zodiacService, FortuneCrudRepo fortuneRepo) {
        this.zodiacService = zodiacService;
        this.fortuneRepo = fortuneRepo;
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

        int randomIndex = (int) (Math.random() * allFortunes.size());
        hscope.setHoroscope(allFortunes.get(randomIndex).getText());
        return hscope;
    }

    @PostConstruct
    public void initHoroscopes() {
        fortuneRepo.findAll().forEach(allFortunes::add);
        //allFortunes = (List<Fortune>) fortuneRepo.findAll();
//        ObjectMapper mapper = new ObjectMapper();
//
//        try {
//            allFortunes = Arrays.asList(mapper.readValue(
//                    fortunes.getFile(),
//                    Fortune[].class)
//            );
//        } catch (IOException e) {
//            e.printStackTrace();
//            allFortunes = new ArrayList<>(List.of(new Fortune()));
//        }
    }
}
