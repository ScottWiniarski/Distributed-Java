package edu.wctc.distjavazodiac.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.wctc.distjavazodiac.entity.Month;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BasicMonthListService implements MonthListService {
    @Value("classpath:months.json")
    private Resource months;
    private List<Month> monthList;

    @Override
    public List<Month> getMonths() {
        return monthList;
    }

    @PostConstruct
    public void initMonths() {
        ObjectMapper mapper = new ObjectMapper();

        try {
            monthList = Arrays.asList(mapper.readValue(
                    months.getFile(),
                    Month[].class));
        } catch (IOException e) {
            e.printStackTrace();
            monthList = new ArrayList<>(0);
        }
    }
}
